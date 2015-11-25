import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Borislav on 10/25/2015.
 */
public class CopyJPGFile {
    public static void main(String[] args) {
        try(FileInputStream startPhoto = new FileInputStream("library/Homework.jpg");
            FileOutputStream destination = new FileOutputStream("library/my-copied-picture.jpg")) {
            byte[] buffer = new byte[4096];
            while (true) {
                int readBytes = startPhoto.read(buffer, 0, buffer.length);
                if(readBytes <= 0) break;
                destination.write(buffer, 0, readBytes);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
