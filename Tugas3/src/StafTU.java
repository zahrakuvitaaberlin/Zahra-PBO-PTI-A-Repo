package Tugas3;

public class StafTU {
   public String nama;
   public String bagian;
   public String LatarBelakang; 

    public void menghitung(){
        System.out.println(nama + " seorang staf TU yang bekerja dibagian " + bagian + " karena dia " + LatarBelakang);
    }
    public void membuatJadwal(){
        System.out.println("selain menghitung administrasi " + nama + " juga membuat jadwal");
    }
    public void Gaji(int gaji){
        System.out.println(nama + " medapatkan gaji sebesar Rp." + gaji + " selama menjadi staf TU");
    }
}
