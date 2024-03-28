package TugasPBO.TugasPraktikkum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SwalayanTiny {
    static Map<String, AkunPelanggan> akunPelanggan = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inisialisasi();
        boolean exit = false;
        while (!exit) {
            System.out.println("      -----------------------------------     ");
            System.out.println("======| Selamat Datang di Swalayan TINY |======");
            System.out.println("      -----------------------------------      ");
            System.out.println();
            System.out.println("1. Pembelian");
            System.out.println("-------------------");
            System.out.println("2. Top Up");
            System.out.println("--------------------");
            System.out.println("3. Keluar");
            System.out.println("--------------------");
            System.out.println("____________________");
            System.out.print("Pilih opsi: ");

            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    beli();
                    break;
                case 2:
                    topUp();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Terimakasih telah berkunjung!!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void inisialisasi() {
        akunPelanggan.put("38000001", new AkunPelanggan("38000001", "Pelanggan Silver", 1500000, "1111"));
        akunPelanggan.put("56111112", new AkunPelanggan("56111112", "Pelanggan Gold", 2500000, "0000"));
        akunPelanggan.put("74333334", new AkunPelanggan("74333334", "Pelanggan Platinum", 3500000, "2222"));
    }

    public static void beli() {
        System.out.println();
        System.out.println("___________________________");
        System.out.print("Masukkan nomor pelanggan: ");
        String nomorPelanggan = scanner.next();
        System.out.print("Masukkan PIN anda: ");
        String pin = scanner.next();

        AkunPelanggan akun = akunPelanggan.get(nomorPelanggan);
        if (akun != null && akun.autentikasi(pin)) {
            System.out.print("Masukkan jumlah pembelian: ");
            double jumlahPembelian = scanner.nextDouble();
            if (jumlahPembelian > 1000000) {
                double cashback = akun.getCashback(jumlahPembelian);
                System.out.println("Cashback yang diterima: Rp" + cashback);
            }
            double saldoBaru = akun.getSaldo() - jumlahPembelian;
            if (saldoBaru < 10000) {
                System.out.println("Transaksi gagal. Saldo tidak cukup :(.");
            } else {
                akun.setSaldo(saldoBaru);
                System.out.println("Transaksi berhasil :). Saldo saat ini: Rp" + saldoBaru);
            }
        } else {
            System.out.println("Autentikasi gagal. Nomor pelanggan atau PIN salah.");
        }
    }

    public static void topUp() {
        System.out.println();
        System.out.println("___________________________");
        System.out.print("Masukkan nomor pelanggan: ");
        String nomorPelanggan = scanner.next();
        System.out.print("Masukkan PIN anda: ");
        String pin = scanner.next();

        AkunPelanggan akun = akunPelanggan.get(nomorPelanggan);
        if (akun != null && akun.autentikasi(pin)) {
            System.out.print("Masukkan jumlah top up: ");
            double jumlahTopUp = scanner.nextDouble();
            double saldoBaru = akun.getSaldo() + jumlahTopUp;
            akun.setSaldo(saldoBaru);
            System.out.println("Top up berhasil. Saldo anda saat ini: Rp" + saldoBaru);
        } else {
            System.out.println("Autentikasi gagal. Nomor pelanggan atau PIN salah.");
        }
    }
}

class AkunPelanggan {
    private String nomorPelanggan;
    private String namaPelanggan;
    private double saldo;
    private String pin;
    private int percobaanAutentikasi;

    public AkunPelanggan(String no, String nama, double saldo, String PIN) {
        this.nomorPelanggan = no;
        this.namaPelanggan = nama;
        this.saldo = saldo;
        this.pin = PIN;
        this.percobaanAutentikasi = 0;
    }

    public boolean autentikasi(String pin) {

        if (pin.equals(this.pin)) {
            this.percobaanAutentikasi = 0;
            return true;
        } else {
            this.percobaanAutentikasi++;
            if (this.percobaanAutentikasi >= 3) {

                System.out.println("Akun anda telah terblokir");
                System.exit(0);
            }
            return false;
        }
    }

    public double getCashback(double jumlahPembelian) {
        if (nomorPelanggan.startsWith("38")) {
            return jumlahPembelian > 1000000 ? jumlahPembelian * 0.05 : 0;
        } else if (nomorPelanggan.startsWith("56")) {
            return jumlahPembelian > 1000000 ? jumlahPembelian * 0.07 : jumlahPembelian * 0.02;
        } else if (nomorPelanggan.startsWith("74")) {
            return jumlahPembelian > 1000000 ? jumlahPembelian * 0.10 : jumlahPembelian * 0.05;
        } else {
            return 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
