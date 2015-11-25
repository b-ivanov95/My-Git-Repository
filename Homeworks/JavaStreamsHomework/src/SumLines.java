import java.io.*;

/**
 * Created by Borislav on 10/25/2015.
 */
public class SumLines {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(
                        new File("library/lines.txt")))) {
            String line = reader.readLine();
            while (line != null) {
                int currentLineSum = 0;
                for (int i = 0; i < line.length(); i++) {
                    currentLineSum += line.charAt(i);
                }
                System.out.println(currentLineSum);
                line = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
