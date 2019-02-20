/**
 *
 * @author dwianto
 */
import java.util.Scanner;

public class JavaScanner {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Siapa Nama Kamu? ");
        String nama = scanner.next();
 
        System.out.print("Berapa Umur Kamu? ");
        int umur = scanner.nextInt();
 
        System.out.println("Hello : " + nama);
        System.out.println("Kamu Berumur : " + umur);
        scanner.close();
        
    }
    
}
