import java.util.Random;
import java.util.Scanner;

/**
 * Created by Borislav on 10/22/2015.
 */
public class RandomizeNtoM {

    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    public static void main(String[] args) {
        int _n = sc.nextInt();
        int _m = sc.nextInt();
        int diff = Math.abs(_n - _m) + 1;
        if (_n >= _m) {
            for (int i = 0; i < diff; i++) {
                System.out.println(_m + (int)(Math.random() * ((_n - _m) + 1)));
            }
        }else {
            for (int i = 0; i < diff; i++) {
                System.out.println(_n + (int)(Math.random() * ((_m - _n) + 1)));
            }
        }
    }

}
