import java.util.Scanner;

/**
 * Created by Borislav on 10/22/2015.
 */
public class FormatingNumbers {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scan.nextInt();
        String aS = Integer.toBinaryString(a);
        while (aS.length() < 10) {
            aS = "0" + aS;
        }
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        System.out.printf("|%1$-10X|%2$10s|%3$10.2f|%4$-10.3f|", a, aS, b, c);
    }
}
