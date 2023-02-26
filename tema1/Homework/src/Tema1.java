
public class Tema1 {


    public static void main(String[] args) {

        LatinMatrix matrix = new LatinMatrix("100");
        matrix.display();
        System.out.println("Time= "+matrix.getTime());

    }
}

class LatinMatrix{

    private int[][] matrix;
    private int size;
    private long time ;

    public LatinMatrix(String size){
        this.size = Integer.parseInt(size);
        matrix = new int[this.size][this.size];
        createLatinMatrix();
    }

    private void createLatinMatrix(){
        long start = System.nanoTime();
        for (int i = 0; i <size ; i++) {
            matrix[0][i] = i+1;
        }

        for(int i = 1 ; i<size;i++){
            matrix[i]= getShiftedLine(matrix[i-1]);
        }
        long finish = System.nanoTime();
        time = finish-start;
    }

    private int[] getShiftedLine(int[] line){
        int[] shiftedLine = new int[line.length];
        for(int i = 1; i<line.length;i++){
            shiftedLine[i] = line[i-1];
        }
        shiftedLine[0] = line[line.length-1];
        return shiftedLine;
    }

    public int[][] getMatrix(){
        return this.matrix;
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public double getTime(){
        return (double) time /100_000_000;
    }

}