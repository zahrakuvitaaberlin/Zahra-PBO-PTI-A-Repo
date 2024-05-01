package Praktikum;

public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true: laki-laki, false: perempuan
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) { // laki-laki
                return 25.0;
            } else { // perempuan
                return 20.0;
            }
        } else {
            return 15.0;
        }
    }

    // Method untuk mendapatkan pendapatan
    public double getPendapatan() {
        // Untuk sementara, asumsikan pendapatan tetap
        // Anda dapat mengganti logika ini sesuai dengan kebutuhan
        return 1000.0;
    }

    // Method untuk menampilkan informasi
    @Override
    public String toString() {
        return "Nama         : " + nama + "\nNIK          : " + nik + "\nJenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
               "\nPendapatan   : " + getPendapatan() + "\nTunjangan    : " + getTunjangan();
    }
}


