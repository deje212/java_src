public class SwitchDay {
    public static void main(String[] args) {

      int hari = 4;
      int bln  = 2;
      String day = Hari(hari);
      String bulan = Bulan(bln);
      System.out.println("Hari ke " + hari + " Adalah : " + day + " dan Bulan ke " + bln + " Adalah :" + bulan);

    }
    
    public static String Hari(Integer hari) {
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
        return day;   
    }
    
    public static String Bulan(Integer bln) {
        String bulan;
	        
        switch (bln) {
         case 1:
           bulan = "Januari";
           break;
         case 2:
           bulan = "Febuari";
	   break;
         case 3:
           bulan = "Maret";
           break;
         case 4:
           bulan = "April";
           break;
         case 5:
           bulan = "Mei";
           break;
         case 6:
           bulan = "Juni";
           break;
         case 7:
           bulan = "Juli";
           break;
         case 8:
           bulan = "Agustus";
           break;
         case 9:
           bulan = "September";
           break;
         case 10:
           bulan = "Oktober";
           break;
         case 11:
           bulan = "November";
           break;
         case 12:
           bulan = "Desember";
           break;
         default: 
           bulan = "Febuari";
           break;
      }
        return bulan;   
    }
    
    
}
