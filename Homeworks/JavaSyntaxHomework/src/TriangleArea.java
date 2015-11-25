/**
 * Created by Borislav on 10/22/2015.
 */
public class TriangleArea {


    public static void main(String[] args) {
        System.out.println(calculateArea(1, 1, 2, 2, 3, 3));
    }
    public static double calculateArea(int aX, int aY, int bX, int bY, int cX, int cY) {
        return Math.abs((aX-cX)*(bY-aY)-
                (aX-bX)*(cY-aY)) * 0.5;
    }
}
