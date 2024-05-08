package Praktikkum;

class KuePesanan extends Kue {
    double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    double hitungHarga() {
        return harga * berat;
    }
}
