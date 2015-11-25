import java.util.Scanner;

/**
 * Created by Borislav on 10/22/2015.
 */
public class DecimalToBase7 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int dec = sc.nextInt();
        System.out.println(Integer.toString(dec, 7));
    }


}
