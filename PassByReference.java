
/**
 *
 * @author dwianto
 */
public class PassByReference {
    public static void ubahNama(String[] nama){
       
        nama[0] = "bssn";
        System.out.println("nama baru di dalam method: " + nama[0]);
    }
    public static void main(String[] arg){
        String[] nama = new String[1];
        nama[0] = "ragunan";
        System.out.println("nama lama dari method main: " + nama[0]);
        ubahNama(nama);
        System.out.println("nama lama dari method main: " + nama[0]);
    }
}
