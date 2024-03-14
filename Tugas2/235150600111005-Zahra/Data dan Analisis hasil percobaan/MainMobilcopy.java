package Tugas2;
import java.util.Scanner;


public class MainMobilcopy {
     public static void main(String[] args) {
        //instan objek bernama m1
        int Kecepatan;
        String Manufaktur;
        String noPlat;
        String Warna;
        double waktu;
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan kecepatan : ");
        Kecepatan = input.nextInt();
        input.nextLine();
        System.out.print("masukkan noplat : ");
        noPlat = input.nextLine();
        System.out.print("masukkan warna : ");
        Warna = input.nextLine();
        System.out.print("masukkan merek : ");
        Manufaktur = input.nextLine();
        System.out.print("masukkan waktu : ");
        waktu = input.nextDouble();

        tugas2 m1 = new tugas2();
        m1.setKecepatan(Kecepatan);
        m1.setManufaktur(Manufaktur);
        m1.setNoPlat(noPlat);
        m1.setWarna(Warna);
        m1.setWaktu(waktu);
        m1.displayMessage();
        System.out.println("================");
        //instan objek baru bernama m2
        tugas2 m2 = new tugas2();
        m2.setKecepatan(100);
        m2.setManufaktur("Mitsubishi");
        m2.setNoPlat("N 1134 AG");
        m2.setWarna("Pink");
        m2.setWaktu(waktu);
        m2.displayMessage();
        System.out.println("================");
        //merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");
        //menampilkan hasil perubahan
        m1.displayMessage();
    }
}
    
