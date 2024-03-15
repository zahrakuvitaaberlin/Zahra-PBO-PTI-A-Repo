package Tugas3;

public class siswa {
    public String nama;
    public String NIS; 
    public String TTL;
    public String JenisKelamin; 
    public String Sekolah;

    public void MengerjakanPR(String pr){
        System.out.println(nama + " sangat senang mengerjakan PR " + pr);
    }
    public void Upacara(){
        System.out.println(nama + " rutin mengikuti upacara setiap hari senin di " + Sekolah);
    }
    public void Terlambat(){
        System.out.println(Sekolah + " sangat tertib sehingga " + nama + " tidak pernah terlambat");
    }
    public void tampilanData(){
        System.out.println("---DATA SISWA---");
        System.out.println("Nama Siswa : " + nama);
        System.out.println("NIS : " + NIS);
        System.out.println("TTL : " + TTL);
        System.out.println("Jenis Kelamin : " + JenisKelamin);
        System.out.println("Asal Sekolah : " + Sekolah);
    }
}
