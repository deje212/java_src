/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwianto
 */
public class AnonymousArray {
    
     public static void printArray(String[] data){ 
         System.out.println(data[1]);
         System.out.println("panjang data : " + data.length);
      }
     
     public void printDuaDimensi(Integer[][] duaDimensi) {
                  
          System.out.println(duaDimensi[1][1]);
          System.out.println("Jumlah Array  : " + duaDimensi.length);
          System.out.println("Jumlah Data Array 1 : " + duaDimensi[1].length);
      
     }
      public static void main(String[] args){ 
          Integer[][] duaDimensi = new Integer[][]{{1,2,3},{2,3}};
          String[] Algoritma = new String[]{"AES","DSA","ECDH","RSA"};
          
          AnonymousArray dua = new AnonymousArray();
          dua.printDuaDimensi(duaDimensi);
          printArray(Algoritma); 
      }
    
}
