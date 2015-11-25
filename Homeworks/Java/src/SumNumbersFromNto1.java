import java.util.Scanner;

/**
 * Created by Borislav on 10/19/2015.
 */
public class SumNumbersFromNto1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int input = Integer.parseInt(sc.next());
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
