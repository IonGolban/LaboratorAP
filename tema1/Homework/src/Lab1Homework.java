import java.util.Arrays;

public class Lab1Homework {


    public static void main(String[] args) {

        LatinMatrix latinMatrix = new LatinMatrix(args[0]);
        if(latinMatrix.getSize()<100) System.out.println(latinMatrix);
        System.out.println("Time= "+latinMatrix.getTime());

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

    @Override
    public String toString() {
        String latinMatrix = new String();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
               latinMatrix+=matrix[i][j]+" ";
            }
            latinMatrix+="\n";
        }

        return latinMatrix;
    }

    public int getSize() {
        return size;
    }

    public double getTime(){
        return (double) time /100_000_000;
    }

}