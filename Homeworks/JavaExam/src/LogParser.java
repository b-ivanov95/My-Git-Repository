import java.util.*;

/**
 * Created by Borislav on 11/15/2015.
 */
public class LogParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        TreeMap<String,TreeMap<String, List<String>>> projectsData = new TreeMap<>();

        while (!line.equals("END")) {
            String myNewString;
            myNewString = line.replaceAll("[^A-Za-z0-9]", " ");
            String noTabs = myNewString.replaceAll ("\\s\\s+", " ").trim ();
            String [] data = noTabs.split(" ");
            if(!projectsData.containsKey(data[1])) {
                TreeMap<String, List<String>> errors = new TreeMap<>();
                ArrayList messages = new ArrayList();
                messages.add(data[5]);
                projectsData.put(data[1],errors);
            }
            line = sc.nextLine();
        }
    }
}
