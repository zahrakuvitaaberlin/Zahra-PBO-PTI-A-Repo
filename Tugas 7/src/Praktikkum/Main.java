package Praktikkum;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi array kue
        Kue[] kueArray = new Kue[20];

        // Mengisi objek kue dengan berbagai jenis kue
        kueArray[0] = new KuePesanan("Brownies", 20.0, 0.5);
        kueArray[1] = new KuePesanan("Donat", 10.0, 0.3);
        kueArray[2] = new KuePesanan("Kue Lumpur", 15.0, 0.4);
        kueArray[3] = new KueJadi("Lapis Legit", 50.0, 2);
        kueArray[4] = new KueJadi("Bolu Kukus", 30.0, 3);
        // Lanjutkan mengisi hingga elemen ke-19
        // Tambahkan inisialisasi untuk elemen-elemen yang tersisa
        for (int i = 5; i < kueArray.length; i++) {
            if (i % 2 == 0) {
                kueArray[i] = new KuePesanan("Kue Pesanan " + (i + 1), 25.0, 0.6);
            } else {
                kueArray[i] = new KueJadi("Kue Jadi " + (i + 1), 40.0, 4);
            }
        }

        // Tampilkan semua kue beserta jenisnya
        System.out.println("Semua kue:");
        for (Kue kue : kueArray) {
            System.out.println("- " + kue);
        }

        // Hitung total harga dari semua jenis kue
        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("Total harga semua kue: " + totalHarga);

        // Hitung total harga dan total berat dari KuePesanan
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).berat;
            }
        }
        System.out.println("Total harga kue pesanan: " + totalHargaPesanan);
        System.out.println("Total berat kue pesanan: " + totalBerat);

        // Hitung total harga dan total jumlah dari KueJadi
        double totalHargaJadi = 0;
        double totalJumlah = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).jumlah;
            }
        }
        System.out.println("Total harga kue jadi: " + totalHargaJadi);
        System.out.println("Total jumlah kue jadi: " + totalJumlah);

        // Tampilkan informasi kue dengan harga (harga akhir) terbesar
        double hargaTerbesar = kueArray[0].hitungHarga();
        Kue kueTerbesar = kueArray[0];
        for (Kue kue : kueArray) {
            if (kue.hitungHarga() > hargaTerbesar) {
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        System.out.println("Kue dengan harga terbesar: " + kueTerbesar);
    }
}
