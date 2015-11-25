import java.util.Scanner;

/**
 * Created by Borislav on 10/19/2015.
 */
public class GhettoNumeralSystem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input = sc.next();
        char[] asArray = input.toCharArray();
        String sum = "";
        for (int i = 0; i < input.length(); i++) {
            switch (asArray[i]) {
                case '0':
                    sum += "Gee";
                    break;
                case '1':
                    sum += "Bro";
                    break;
                case '2':
                    sum += "Zuz";
                    break;
                case '3':
                    sum += "Ma";
                    break;
                case '4':
                    sum += "Duh";
                    break;
                case '5':
                    sum += "Yo";
                    break;
                case '6':
                    sum += "Dis";
                    break;
                case '7':
                    sum += "Hood";
                    break;
                case '8':
                    sum += "Jam";
                    break;
                case '9':
                    sum += "Mack";
                    break;
            }
        }
        System.out.println(sum);
    }


}
