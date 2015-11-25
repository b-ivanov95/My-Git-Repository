import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Borislav on 15.11.2015 ã..
 */
public class RubixMatrix2 {
    public static void main(String[] args)
    {


        Scanner console = new Scanner(System.in);
        String[] vhod=console.nextLine().split(" ");
        int rows = Integer.parseInt(vhod[0]);
        int cows = Integer.parseInt(vhod[1]);
        int[][] Matrix = new int[rows][cows];
        int numberinCell = 1;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cows; j++)
            {
                Matrix[i][j]=numberinCell;
                numberinCell++;
            }
        }

        int numberComands = Integer.parseInt(console.nextLine());
        for (int i = 0; i < numberComands; i++)
        {
            String[] comand = console.nextLine().split(" ");
            switch (comand[1])
            {
                case "up":Matrix=moveUp(Matrix,Integer.parseInt(comand[0]),Integer.parseInt(comand[2]),rows,cows);break;
                case "down":Matrix=moveDown(Matrix, Integer.parseInt(comand[0]), Integer.parseInt(comand[2]), rows, cows);break;
                case "left":Matrix=moveLeft(Matrix, Integer.parseInt(comand[0]), Integer.parseInt(comand[2]), rows, cows);break;
                case "right":Matrix=moveRight(Matrix, Integer.parseInt(comand[0]), Integer.parseInt(comand[2]), rows, cows);break;
            }

        }
        int temp=1;
        int helpkeepnumber;
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cows; j++) {
                if (Matrix[i][j]==temp)
                {
                    System.out.println("No swap required");
                }
                else
                {
                    for (int o = 0; o <rows ; o++)
                    {
                        for (int p = 0; p < cows; p++)
                        {
                            if (Matrix[o][p]==temp)
                            {
                                helpkeepnumber=Matrix[i][j];
                                Matrix[i][j]=Matrix[o][p];
                                Matrix[o][p]=helpkeepnumber;
                                System.out.printf("Swap (%d, %d) with (%d, %d)",i,j,o,p);
                                System.out.println();
                                break;
                            }
                        }

                    }
                }
                temp++;
            }

        }
    }
    static int[][] moveUp(int[][] Matrix,int wichCows,int times,int rows,int cows)
    {
        for (int y = 0; y < times; y++) {


            int first;
            first = Matrix[0][wichCows];
            for (int i = 0; i < rows - 1; i++) {
                Matrix[i][wichCows] = Matrix[i + 1][wichCows];

            }
            Matrix[rows - 1][wichCows] = first;
        }
        return Matrix;
    }
    static int[][] moveDown(int[][] Matrix,int wichCows,int times,int rows,int cows)
    {
        for (int y = 0; y < times; y++) {


            int last;
            last =  Matrix[rows - 1][wichCows];
            for (int i = rows - 1; i >0; i--) {
                Matrix[i ][wichCows]=Matrix[i-1][wichCows] ;
            }
            Matrix[0][wichCows] = last;
        }
        return Matrix;
    }
    static int[][] moveLeft(int[][] Matrix,int wichRows,int times,int rows,int cows)
    {
        for (int y = 0; y < times; y++) {


            int first;
            first =  Matrix[wichRows][0];
            for (int i = 0; i < cows-1; i++) {
                Matrix[wichRows][i]=Matrix[wichRows][i+1] ;
            }
            Matrix[wichRows][cows-1] = first;
        }
        return Matrix;
    }
    static int[][] moveRight(int[][] Matrix,int wichRows,int times,int rows, int cows) {
        for (int y = 0; y < times; y++) {


            int last;
            last =  Matrix[wichRows][cows - 1];
            for (int i = cows -1 ; i >0; i--) {
                Matrix[wichRows][i]=Matrix[wichRows][i -1] ;
            }
            Matrix[wichRows][0] = last;
        }
        return Matrix;
    }
}