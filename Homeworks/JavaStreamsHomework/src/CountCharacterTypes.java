import java.io.*;
import java.util.Arrays;

/**
 * Created by Borislav on 10/25/2015.
 */
public class CountCharacterTypes {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int symbols = 0;

        try (FileReader reader = new FileReader(new File("library/words.txt"));
             PrintWriter writer = new PrintWriter(new FileWriter("library/count-chars.txt"))) {
            int input = reader.read();
            while (input != -1) {
                char ch = (char) input;
                if (Character.isLetter(ch)) {
                    if (Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u'}).contains(ch)) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (Arrays.asList(new Character[]{'!', ',', '.', '?'}).contains(ch)) {
                    symbols++;
                }

                input = reader.read();
            }

            writer.write(String.format("Vowels: %d\nConsonants: %d\nPunctuation: %d", vowels, consonants, symbols
            ));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
