package Praktikum;

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa tagihan
        Invoice[] tagihan1 = {new Invoice("Barang1", 2, 10000), new Invoice("Barang2", 1, 20000)};
        Invoice[] tagihan2 = {new Invoice("Barang3", 3, 15000), new Invoice("Barang4", 2, 25000)};

        // Membuat beberapa karyawan
        Employee karyawan1 = new Employee(11234456, "boi", 1000000, tagihan1);
        Employee karyawan2 = new Employee(22345567, "lala", 1500000, tagihan2);

        // Menampilkan informasi karyawan dan detail tagihannya
        System.out.println(karyawan1.toString());
        System.out.println(karyawan2.toString());
    }
}

