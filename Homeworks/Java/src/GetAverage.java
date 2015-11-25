/**
 * Created by Borislav on 10/19/2015.
 */
public class GetAverage {

    static GetAverage avg = new GetAverage();
    private static double getAverage(double a, double b, double c) {
        return (a + b + c) / 3.00;
    }
    public static void main(String[] args) {
        System.out.println(String.format("%.2f", getAverage(0, 0, 2)));
    }
}
