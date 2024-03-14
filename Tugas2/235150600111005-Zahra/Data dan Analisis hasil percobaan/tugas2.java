package Tugas2;


public class tugas2 {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double waktuSecond;
    private double kecepatanMs;
   
    
    public void setNoPlat(String n){
        noPlat = n;
    }
    
    public void setWarna(String w){
        warna = w;
    }
    
    public void setManufaktur(String m){
        manufaktur = m;
    }
    
    public void setKecepatan(int k){
        kecepatan = k;
        rubahKecepatan(k);
    }
    
    public void setWaktu(double d) { 
        waktu = d;
        rubahKeSekon(d);
    }
    
    private void rubahKeSekon(double d) { 
        waktuSecond = d * 3600.0;
    }
    
    private void rubahKecepatan(double i) {
        kecepatanMs = kecepatan * 1000.0 / 3600.0;
    }
    
    public double hitungJarak() {
        return (kecepatanMs * waktuSecond) / 1000.0;
    }
    
    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan);
        System.out.println("dan dapat menempuh jarak " + hitungJarak() + " km" );
    }
}
