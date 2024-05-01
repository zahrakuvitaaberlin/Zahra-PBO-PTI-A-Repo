package Praktikum;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Testcase untuk MahasiswaFilkom
        LocalDate tahunMasuk = LocalDate.of(2018, 9, 1); // Misal, mengikuti tahun masuk saya
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Ipul", true, "3562001986660001", false, "185150201234567", 2.8);
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Jane Doe", false, "987654321", true, "165150211234567", 3.2);
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("Alice", false, "135792468", true, "165150221234567", 3.8);

        System.out.println("===========================================");
        System.out.println("Testcase untuk MahasiswaFilkom:");
        System.out.println();
        System.out.println("a. IPK < 3:");
        System.out.println(mahasiswa1.toString());
        System.out.println();

        System.out.println("\nb. IPK 3 - 3.5:");
        System.out.println(mahasiswa2.toString());
        System.out.println();

        System.out.println("\nc. IPK 3.5 - 4:");
        System.out.println(mahasiswa3.toString());
        System.out.println();


        // Testcase untuk Pekerja
        LocalDate tahunMasukPekerja = LocalDate.of(2015, 1, 1);
        Pekerja pekerja1 = new Pekerja("Andi", true, "35720060011199001", true, 5000, tahunMasukPekerja, 2);
        Pekerja pekerja2 = new Pekerja("Sari", false, "3568889987654321", true, 6000, tahunMasukPekerja, 0);
        Pekerja pekerja3 = new Pekerja("Eko", true, "354777135792468", true, 7000, tahunMasukPekerja, 10);


        System.out.println("===========================================");
        System.out.println("Testcase untuk Pekerja:");
        System.out.println("a. Lama bekerja 2 tahun, anak 2:");
        System.out.println(pekerja1.toString());
        System.out.println();

        System.out.println("\nb. Lama bekerja 9 tahun:");
        System.out.println(pekerja2.toString());
        System.out.println();

        System.out.println("\nc. Lama bekerja 20 tahun, anak 10:");
        System.out.println(pekerja3.toString());
        System.out.println();


        // Testcase untuk Manager
        Manager manager = new Manager("David", true, "3520981120830001", true, 7500, tahunMasukPekerja, 0, "IT");

        System.out.println("===========================================");
        System.out.println("Testcase untuk Manager:");
        System.out.println("Lama bekerja 15 tahun dengan gaji $7500:");
        System.out.println(manager.toString());
    }
}
