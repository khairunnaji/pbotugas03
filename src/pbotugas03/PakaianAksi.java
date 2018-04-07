
package pbotugas03;
public class PakaianAksi {
    public static void main(String[] args) {
     Pakaian p = new Pakaian();
p.setKain("tenun");
p.setWarna("warna");
p.setUkuran("L");
p.setHarga(250000);
             
             p.cetakInfo();
             
             System.out.print("Kainnya \t: ");
             System.out.println(p.getKain());
             System.out.print("warnanya \t: ");
             System.out.println(p.getWarna());
             System.out.print("ukurannya \t: ");
             System.out.println(p.getUkuran());
             System.out.print("harganya \t: ");
             System.out.println(p.getHarga());
             
             BajuSakulah bs = new BajuSakulah();
             bs.setKain("Tisiyuu");
             bs.setWarna("Bairu");
             bs.setUkuran("L");
             bs.setHarga(1400000);
             bs.setJeniskancing("Lonjong");
      
             
             bs.cetakInfo();
             System.out.println("Jenis \t:"+bs.getJeniskancing());
             bs.throttle();
             
             BajuKantor BK = new BajuKantor();
             BK.setKain("Tisiyuu");
             BK.setWarna("Bairu");
             BK.setUkuran("L");
             BK.setHarga(1400000);
             BK.setMotiv("Sasirangan");
             BK.cetakInfo();
             System.out.println("Motiv \t:"+BK.getMotiv());
             BK.throttle();
    
    }
  
}
