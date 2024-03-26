public class Guru {
    public String nama;
    public int umur;
    public String mapel;
    
    // Constructor overload pertama
    public Guru() {
        nama = "nurul";
        umur = 25;
        mapel = "Matematika";
    }
    
    // Constructor overload kedua
    public Guru(String nama, int umur, String mapel) {
        this.nama = nama;
        this.umur = umur;
        this.mapel = mapel;
    }
    
    // Constructor overload ketiga
    public Guru(String nama) {
        this.nama = nama;
        this.umur = 30;
        this.mapel = "Fisika";
    }

    // Method overload pertama
    public void mengajar(String kelas){
        System.out.println(nama + " mengajar mata pelajaran " + mapel + " di kelas " + kelas);
    }
    
    // Method overload kedua
    public void mengajar(String kelas, String jurusan){
        System.out.println(nama + " mengajar mata pelajaran " + mapel + " di kelas " + kelas + " jurusan " + jurusan);
    }
    
    // Method overload ketiga
    public void mengajar(String kelas, int jam){
        System.out.println(nama + " mengajar mata pelajaran " + mapel + " di kelas " + kelas + " selama " + jam + " jam");
    }
    
    // Method instans yang mengembalikan tipe data class itu sendiri
    public Guru getGuruInfo(){
        return this;
    }
    public void biodata(){
        System.out.println(nama + " adalah guru mata pelajaran " + mapel + " yang berumur " + umur + " tahun");
    }
    

}
