import java.util.Scanner;

/**
 * Created by Borislav on 10/22/2015.
 */
public class CalculateExpression {

    static Scanner scan = new Scanner(System.in);
    public static double f1(double a, double b, double c) {
        return Math.pow(((a * a + b * b)/(a * a - b * b)), ((a + b + c)/ Math.sqrt(c)));
    }

    public static double f2(double a, double b, double c) {
        return Math.pow((a * a + b * b - c * c * c), a - b);
    }
    public static void main(String[] args) {
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double diff = Math.abs(((a + b + c) / 3) - (f1(a, b, c) + f2(a, b, c)) / 2);
        System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f", f1(a, b, c), f2(a, b, c), diff);
    }
}
