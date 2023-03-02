import java.util.Scanner;

public class BonusT1 {


    public static void main(String[] args) {
        int nrNodes ;

        //Read from the terminal or keyboard
        try{
            nrNodes = Integer.parseInt(args[0]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            Scanner scanner =new Scanner(System.in);
            System.out.println("The number of nodes : ");
            nrNodes = scanner.nextInt();
        }


        CycleGraph cycleGraph = new CycleGraph(nrNodes);
        cycleGraph.display();
        System.out.println();
        cycleGraph.computeToPower(2);
        cycleGraph.display();
    }
}

class CycleGraph {

    private int[][] adjacencyMatrix;
    private int nrNodes;

    CycleGraph(int nrNodes){
        this.nrNodes=nrNodes;
        adjacencyMatrix = new int[nrNodes][nrNodes];
        createAdjacencyMatrix();
    }

    private void createAdjacencyMatrix(){

        for (int i = 0; i < nrNodes; i++) {
            for (int j = 0; j < nrNodes; j++) {
                if(i==j+1||j==i+1){
                    adjacencyMatrix[i][j]= 1;
                }
            }
        }
        adjacencyMatrix[0][nrNodes-1] = 1;
        adjacencyMatrix[nrNodes-1][0] = 1;
    }

    public void computeToPower(int power){

        while(power > 1){
            int[][] tempMatrix = copyMatrix(adjacencyMatrix);
            for (int row = 0; row < nrNodes; row++) {
                for (int col = 0; col < nrNodes; col++) {
                    int sum = 0;
                    for (int k = 0; k < nrNodes; k++) {
                        sum += tempMatrix[row][k] * tempMatrix[k][col];
                    }
                    adjacencyMatrix[row][col] = sum ;
                }
            }
            power--;
        }

    }

    private int[][] copyMatrix(int[][] src) {
        if (src == null) {
            return null;
        }

        int[][] copy = new int[src.length][];
        for (int i = 0; i < src.length; i++) {
            copy[i] = src[i].clone();
        }

        return copy;
    }

    public void display(){
        System.out.print("   ");
        for (int i = 0; i < nrNodes; i++) System.out.print(i%10+" ");
        System.out.println();
        System.out.print("   ");
        for (int i = 0; i < nrNodes; i++) System.out.print("- ");
        System.out.println();

        for (int i = 0; i < nrNodes; i++) {
            System.out.print(i%10+"| ");
            for (int j = 0; j < nrNodes; j++) {
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }



}

