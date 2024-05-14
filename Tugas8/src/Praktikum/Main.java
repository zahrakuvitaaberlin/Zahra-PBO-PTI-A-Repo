package Praktikum;

public class Main {
    public static void main(String[] args) {
        // Objek Pegawai Tetap
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Bayu", "350728490327424892342", 2000000.0);

        // Objek Pegawai Harian
        PegawaiHarian pegawaiHarian = new PegawaiHarian("Edo", "350720490327424892343", 8500.0, 40);

        // Objek Sales
        Sales sales = new Sales("Tika", "350728490327424892344", 50, 50000.0);

        // Output
        System.out.println("Pegawai Tetap:");
        System.out.println(pegawaiTetap);

        System.out.println("Pegawai Harian:");
        System.out.println(pegawaiHarian);

        System.out.println("Sales:");
        System.out.println(sales);
    }
}
