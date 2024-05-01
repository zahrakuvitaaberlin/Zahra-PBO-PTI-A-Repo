package Praktikum;

import java.time.LocalDate;

// Pekerja.java
public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    // Constructor
    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    // Setter
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // Getter
    public double getGaji() {
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    // Method untuk mendapatkan bonus
    public double getBonus() {
        LocalDate currentDate = LocalDate.now();
        int yearsOfWork = currentDate.getYear() - tahunMasuk.getYear();

        if (yearsOfWork <= 5) {
            return gaji * 0.05;
        } else if (yearsOfWork <= 10) {
            return gaji * 0.10;
        } else {
            return gaji * 0.15;
        }
    }

    // Method untuk mendapatkan total gaji
    public double getTotalGaji() {
        double totalGaji = gaji + getBonus();
        if (jumlahAnak > 0) {
            totalGaji += jumlahAnak * 20.0; // Tunjangan anak
        }
        return totalGaji;
    }

    // Method untuk menampilkan informasi
    @Override
    public String toString() {
        return super.toString() + "\nTahun Masuk  : " + tahunMasuk + "\nJumlah Anak  : " + jumlahAnak + "\nGaji         : " + gaji;
    }
}

