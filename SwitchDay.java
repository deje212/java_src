public class SwitchDay {
    public static void main(String[] args) {

      int hari = 4;
      String day;
	        
      switch (hari) {
         case 1:
           day = "Senin";
           break;
         case 2:
           day = "Selasa";
	   break;
         case 3:
           day = "Rabu";
           break;
         case 4:
           day = "Kamis";
           break;
         case 5:
           day = "Jumat";
           break;
         case 6:
           day = "Sabtu";
           break;
         case 7:
           day = "Minggu";
           break;
         default: 
           day = "Invalid day";
           break;
      }
      System.out.println("Hari ke " + hari + " Adalah : " + day);
   }
}
