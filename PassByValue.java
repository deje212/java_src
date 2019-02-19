
/**
 *
 * @author dwianto
 */
public class PassByValue {
    public static void ubahNama(String nama){
        nama = "bssn";
        System.out.println("nama baru di dalam method: " + nama);
    }
    public static void main(String[] arg){
        String nama = "ragunan";
        System.out.println("nama lama dari method main: " + nama);
        ubahNama(nama);
        System.out.println("nama lama dari method main: " + nama);
    }
}
