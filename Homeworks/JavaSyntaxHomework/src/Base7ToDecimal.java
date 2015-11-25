import java.util.Scanner;

/**
 * Created by Borislav on 10/22/2015.
 */
public class Base7ToDecimal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String dec = sc.next();
        System.out.println(Integer.parseInt(dec, 7));
    }
}
