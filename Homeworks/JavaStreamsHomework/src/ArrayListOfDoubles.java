import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Borislav on 10/25/2015.
 */
public class ArrayListOfDoubles {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<Double>() {{
            addAll(Arrays.asList(3.14, 7.5, 0.69, 10.02, 5.55, 69.69, 14.88));
        }};

        saveDoubles(doubles);
        loadDoubles(doubles.size());
    }

    private static void loadDoubles(int numOfItems) {
        try(ObjectInputStream source = new ObjectInputStream(new FileInputStream("library/doubles.list"))) {
            for (int i = 0; i < numOfItems; i++) {
                System.out.println(source.readDouble());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveDoubles(List<Double> doubles) {
        try(ObjectOutputStream destination = new ObjectOutputStream(new FileOutputStream("library/doubles.list"))) {
            for (Double aDouble : doubles) {
                destination.writeDouble(aDouble);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
