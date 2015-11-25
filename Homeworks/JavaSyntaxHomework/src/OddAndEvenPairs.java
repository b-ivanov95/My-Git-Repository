import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Borislav on 10/22/2015.
 */
public class OddAndEvenPairs {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input = sc.nextLine();
        String[] stringArr = input.split(" ");
        int[] holder = Arrays.asList(stringArr).stream().map(Integer::parseInt).mapToInt(i->i).toArray();
        if (holder.length % 2 == 1) {
            System.out.println("Invalid length");
            return;
        }
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < holder.length - 1; i+= 2) {
            if ((holder[i] % 2 == 0) && (holder[i + 1] % 2 == 0)){
                System.out.printf("%1$d, %2$d -> both are even", holder[i], holder[i + 1]);
            }else if ((holder[i] % 2 == 1) && (holder[i + 1] % 2 == 1)){
                System.out.printf("%1$d, %2$d -> both are odd", holder[i], holder[i + 1]);
            }else {
                System.out.printf("%1$d, %2$d -> different", holder[i], holder[i + 1]);
            }
            System.out.println();
        }

    }


}
