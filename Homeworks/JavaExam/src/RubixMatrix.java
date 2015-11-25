import java.util.Scanner;

/**
 * Created by Borislav on 11/15/2015.
 */
public class RubixMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int N = sc.nextInt();
        String command;
        int current = 1;
        int [][] matrix = new int [rows] [cols];
        //filling the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix [i][j] = current;
                current++;
            }
        }

        //printing the matrix

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        matrix = rotateUp(matrix, 1,1);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }




        for (int i = 0; i < N; i++) {
            command = sc.nextLine();
        }


    }

    public static int[][] rotateUp(int [][] inputMatrix, int col, int amount) {
        int [] [] outputMatrix = inputMatrix;
        for (int i = 0; i < outputMatrix.length; i++) {
            if(i == outputMatrix.length-1){
              int temp = outputMatrix [i] [col];
              outputMatrix [i] [col] = outputMatrix [0] [col];
                outputMatrix [0] [col] = temp;
            }

            outputMatrix [i][col] = outputMatrix [i+1] [col];

        }

        return outputMatrix;
    }
}
