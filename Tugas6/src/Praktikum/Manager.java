package Praktikum;

import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    // Constructor
    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    // Setter
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    // Getter
    public String getDepartemen() {
        return departemen;
    }

    // Override method untuk mendapatkan total gaji dengan tunjangan tambahan
    @Override
    public double getTotalGaji() {
        double totalGaji = super.getTotalGaji();
        totalGaji += super.getBonus(); // Menggunakan getBonus() dari kelas Pekerja
        totalGaji += super.getGaji() * 0.10; // Tunjangan tambahan untuk manager
        return totalGaji;
    }

    // Override method untuk menampilkan informasi
    @Override
    public String toString() {
        return super.toString() + "\nDepartemen   : " + departemen;
    }
}

