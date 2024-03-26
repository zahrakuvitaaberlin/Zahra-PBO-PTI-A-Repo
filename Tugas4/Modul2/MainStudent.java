import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
    Student anna = new Student();
    anna.setName("Anna");
    anna.setAddress("Malang");
    anna.setAge(20);
    anna.setMath(100);
    anna.setScience(89);
    anna.setEnglish(80);
    anna.displayMessage();

    //menggunakan constructor lain
    System.out.println("===================");
    Student chris = new Student("Chris", "Kediri", 21);
    chris.setMath(70);
    chris.setScience(60);
    chris.setEnglish(90);
    chris.displayMessage();

    System.out.println("===================");
    Student erlin = new Student(100,90,90);//nomor 2
    erlin.setName("erlin");
    erlin.setAddress("nganjuk");
    erlin.setAge(18);
    erlin.displayMessage();
   
    //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
    System.out.println("===================");
    anna = new Student("anna", "Batu", 18);
    anna.displayMessage();

    //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
    System.out.println("===================");
    chris.setAddress("Surabaya");
    chris.setAge(22);
    chris.displayMessage();


        //nomor 4
    Scanner in = new Scanner(System.in);

    System.out.println();
    System.out.println();

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = in.nextInt();

        Student[] siswa = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = in.next();
            System.out.print("Alamat: ");
            String alamat = in.next();
            System.out.print("Umur: ");
            int umur = in.nextInt();
            System.out.print("Nilai Matematika: ");
            int mathGrade = in.nextInt();
            System.out.print("Nilai Bahasa Inggris: ");
            int englishGrade = in.nextInt();
            System.out.print("Nilai IPA: ");
            int scienceGrade = in.nextInt();

            siswa[i] = new Student(nama, alamat, umur);
            siswa[i].setMath(mathGrade);
            siswa[i].setEnglish(englishGrade);
            siswa[i].setScience(scienceGrade);
        }

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Data Siswa ke-" + (i + 1));
            siswa[i].displayMessage();
            System.out.println();
        }
// no5
        Student.jumlahObjek(jumlahSiswa);
    }
}
    
