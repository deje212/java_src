import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author dwianto
 */
public class ScannerDelimiter {

    public static void main(String[] args) throws FileNotFoundException {

        try (Scanner scanner = new Scanner(new File("files/books.csv"))) {
            scanner.useDelimiter(",");
            
            while (scanner.hasNext()) {
                String title = scanner.next();
                title = title.trim();   // trim the line terminator character
                String author = scanner.next();
                float price = scanner.nextFloat();
                
                System.out.format("Title: %s; Author: %s; Price: %.2f%n",
                        title, author, price);
            }
        }

    }

}
