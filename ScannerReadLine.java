
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dwianto
 */
public class ScannerReadLine {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("files/tasks.txt"));
 
        List<String> listLines = new ArrayList<>();
 
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            listLines.add(line);
        }
        System.out.println(listLines);
        scanner.close();

    }

}
