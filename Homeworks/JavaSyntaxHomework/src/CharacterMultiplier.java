import java.util.Scanner;

/**
 * Created by Borislav on 10/22/2015.
 */
public class CharacterMultiplier {

        public static void sum(String input) {
            String[] arr = input.split(" ");
            if (arr[0].length() > arr[1].length()){
                String temp = arr[1];
                arr[1] = arr[0];
                arr[0] = temp;
            }
            int sum = 0;
            for (int i = 0; i < arr[0].length(); i++) {
                sum += arr[0].charAt(i) * arr[1].charAt(i);
            }
            int diff = arr[1].length() - arr[0].length();
            for (int i = arr[1].length() - diff; i < arr[1].length(); i++) {
                sum += arr[1].charAt(i);
            }
            System.out.println(sum);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            sum(input);
        }
}
