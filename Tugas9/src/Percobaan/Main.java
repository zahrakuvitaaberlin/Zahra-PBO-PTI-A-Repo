package latihaninterface;

public class Main {
    public static void main(String[] args) {

        Hewan hewan = new Hewan();
        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();
        hewan.tampilkanNama();
        hewan.tampilkanUmur();

        // no 8
        Hewan ayam = new Hewan();
        ayam.berjalan();
        ayam.bersuara();

        Manusia manusia = new Manusia("Erlin", 18);
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();
        manusia.tampilkanNama();
        manusia.tampilkanUmur();
        // no 7
        manusia.inputData();

        // no 2
        // MakhlukHidup kucing = new MakhlukHidup() {
            
        // };
    }
}
