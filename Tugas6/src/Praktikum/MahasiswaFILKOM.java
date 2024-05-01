package Praktikum;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public String getStatus() {
        // Mendapatkan angkatan dari nim
        String angkatanStr = nim.substring(0, 2);
        int angkatan = Integer.parseInt(angkatanStr) + 2000;

        // Mendapatkan prodi dari nim
        char prodiCode = nim.charAt(6);
        String prodi = "";
        switch (prodiCode) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Prodi tidak dikenal";
                break;
        }

        return prodi + ", " + angkatan;
    }

    // Method untuk mendapatkan besiswa
    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.0;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return 75.0;
        } else {
            return 0.0;
        }
    }

    // Method untuk menampilkan informasi
    @Override
    public String toString() {
        return super.toString() + "\nNIM          : " + nim + "\nIPK          : " + ipk + "\nStatus       : " + getStatus();
    }
}

