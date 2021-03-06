import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Borislav on 10/22/2015.
 */
public class StartAndEndCapital  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String output = "";
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("(\\b[A-Z][A-Za-z]*[A-Z]\\b)");
        Matcher m = pattern.matcher(input);
        while(m.find()) {
            output += m.group(1) + " ";
        }
        System.out.println(output);
    }
}
