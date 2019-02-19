
/**
 *
 * @author dwianto
 */

public class Lembaga {
    private Long id;                     //instance variable
    private String nama;                 //instance variable
    public static void main(String[] args){
        
        Lembaga lembaga; //local variable/reference variabel lembaga
        lembaga = new Lembaga();
        lembaga.setId(17l);
        lembaga.setNama("BSSN");
            
        Lembaga klonenganlembaga = lembaga; //object Person diinstansiasi
        klonenganlembaga.setNama("bssn"); // yang sama
    }
    public void setId(Long aId){
        this.id = aId;
    }
    public Long getId(){
        return this.id;
    }
    public void setNama(String aNama){
        this.nama = aNama;
        System.out.println("Object Value : " + nama);

    }
    public String getNama(){
        return this.nama;
    }
}
