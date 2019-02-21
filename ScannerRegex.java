import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author dwianto
 */
public class ScannerRegex {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files/books.txt"));
        scanner.useDelimiter("[\r\n]");
 
        String pattern = ".*Java.*";
 
        while (scanner.hasNext()) {
            if (scanner.hasNext(pattern)) {
                String javaBook = scanner.next(pattern);
                System.out.println(javaBook);
            } else {
            scanner.next();
            }
        }
 
        scanner.close();

    }

}
