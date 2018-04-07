
package pbotugas03;

public class Pakaian {
 private String kain;
 private   String warna;
 private   String ukuran;
 private   double harga;
    
    void cetakInfo(){
        System.out.print("kain \t: "+kain+"\n"+
                "warna \t: "+warna+"\n"+
                "ukuran \t: "+ukuran+"\n"+
                "harga \t: "+harga+"\n");
}

    public String getKain() {
        return kain;
    }

    public void setKain(String kain) {
        this.kain = kain;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
