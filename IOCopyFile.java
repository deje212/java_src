/**
 *
 * @author dwianto
 */
import java.io.*;

public class IOCopyFile {
    
    public static void main(String args[]) throws IOException {  
      System.out.println("Current Path :"+ new File(".").getAbsoluteFile());
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("files/input.txt"); //Open File
         out = new FileOutputStream("files/output.txt");
         
         int c;
         while ((c = in.read()) != -1) {   //read file
            out.write(c); //output to out file
         }
      }finally {
         if (in != null) {
            in.close(); //close file
         }
         if (out != null) {
            out.close(); // close file
         }
      }
   }
    
}
