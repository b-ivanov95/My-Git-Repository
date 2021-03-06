import java.io.*;

/**
 * Created by Borislav on 10/25/2015.
 */
public class AllCapitals {
    static final String filePath = "library/lines.txt";

    public static void main(String[] args) {
        StringBuilder uppercasedText = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));
        ) {
            String line = reader.readLine();
            while (line != null) {
                uppercasedText.append(line.toUpperCase() + "\n");
                line = reader.readLine();
            }

            try (PrintWriter writer = new PrintWriter(new FileWriter(new File(filePath)))) {
                writer.write(uppercasedText.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
