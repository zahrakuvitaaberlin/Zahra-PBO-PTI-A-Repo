package Tugas3;

public class Guru {
    public String nama;
    public int umur;
    public String mapel;
    
    public void mengajar(){
        System.out.println(nama + " merupakan gurung mapel " + mapel + " yang mengajar kelas 8");
    }
    public void menginputNilai(){
        System.out.println(nama + "selalu menginput nilai anak didiknya dengan teliti ");
    }
    public void pensiun(int pensiun){
        System.out.println(nama + " akan pensiun pada umur " + pensiun + " tahun");
    }
}
