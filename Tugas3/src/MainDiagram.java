package Tugas3;

public class MainDiagram {
    public static void main(String[] args) {
        siswa siswa1 = new siswa();
        siswa1.nama = "Roni";
        siswa1.NIS = "234515673300";
        siswa1.JenisKelamin = "laki-laki";
        siswa1.TTL = "Malang, 15 September 2009";
        siswa1.Sekolah = "SMP Negeri 2 Malang";
        siswa1.tampilanData();
        siswa1.MengerjakanPR("matematika");
        siswa1.Upacara();
        siswa1.Terlambat();

        System.out.println();

        Guru guru1 = new Guru();
        System.out.println("---GURU---");
        guru1.nama = "Supartini";
        guru1.umur = 50;
        guru1.mapel = "Bahasa Indonesia";
        guru1.mengajar();
        guru1.menginputNilai();
        guru1.pensiun(58);

        System.out.println();
        
        StafTU staf = new StafTU();
        System.out.println("---STAF TU---");
        staf.nama = "Dwi";
        staf.bagian = "Administrasi";
        staf.LatarBelakang = "Sarjana Administrasi";
        staf.menghitung();
        staf.membuatJadwal();
        staf.Gaji(3000000);
    }
    
}
