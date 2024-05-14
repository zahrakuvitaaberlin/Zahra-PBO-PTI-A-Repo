package Praktikum;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        if (totalJam <= 40) {
            return upahPerJam * totalJam;
        } else {
            double normalGaji = upahPerJam * 40;
            double lemburGaji = (totalJam - 40) * upahPerJam * 1.5;
            return normalGaji + lemburGaji;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Upah/jam: Rp " + upahPerJam + "\nTotal jam kerja: " + totalJam + "\nPendapatan: Rp " + gaji() + "\n";
    }
}
