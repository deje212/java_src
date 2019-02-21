
/**
 *
 * @author dwianto
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerReadFileNumber {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner scanner = new Scanner(new File("number.txt"));
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        scanner.close();
 
        System.out.println("Sum of number = " + sum);
        
    }
    
}
