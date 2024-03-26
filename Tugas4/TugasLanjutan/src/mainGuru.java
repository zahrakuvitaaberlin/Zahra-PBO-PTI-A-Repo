public class mainGuru {
    public static void main(String[] args) {


        // Membuat objek guru menggunakan constructor pertama
        Guru guru5 = new Guru();
        guru5.biodata();
        //memanggil method overload 1
        guru5.mengajar("11A");
        System.out.println();
        
        // Membuat objek guru menggunakan constructor kedua
        Guru guru2 = new Guru("Budi", 35, "Kimia");
        guru2.biodata();
        // memanggil method overload 2
        guru2.mengajar("10A", "MIPA");
        System.out.println();
        
        // Membuat objek guru menggunakan constructor ketiga
        Guru guru3 = new Guru("Siti");
        guru3.biodata();
        // memanggil method overload 3
        guru3.mengajar("10C", 2); 
        System.out.println();

        // Memanggil method instans yang mengembalikan tipe data class itu sendiri
        Guru guruInfo = guru2.getGuruInfo();
        System.out.println("Nama guru: " + guruInfo.nama);
        System.out.println("Umur guru: " + guruInfo.umur);
        System.out.println("Mapel yang diajar: " + guruInfo.mapel);
        


    }
}
