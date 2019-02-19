import java.util.Date;
public class EksperimenGarbageCollector {
    public static void main(String[] args){
    Runtime rt = Runtime.getRuntime();
    System.out.println("jumlah memory awal : " + rt.totalMemory());
    for(int i=0;i < 1000000;i++) {
       Date d = new Date();
       d = null; 
    }
    System.out.println("jumlah memory tersedia sebelum gc: " + rt.freeMemory());
    System.gc();
    System.out.println("jumlah memory tersedia setelah gc: " + rt.freeMemory());
}
}
