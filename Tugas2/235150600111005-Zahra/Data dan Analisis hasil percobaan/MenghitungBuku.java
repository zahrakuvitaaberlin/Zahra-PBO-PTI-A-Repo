class menghitung{
    public int lembarBuku;
    public int halamanBuku;
    public int banyakhari;

    public void LembarBuku(int i){
        lembarBuku = i;
    }
    public void HalamanBuku(int h){
        halamanBuku = h;
    }
    public void Banyakhari(){
        banyakhari = halamanBuku * 2;
  
    }
    public void tampilan(){
        System.out.println("jadi mahasiswa tersebut dapat menghabiskan satu buku dalam "+banyakhari+" hari");
    }
}

public class MenghitungBuku {
    public static void main(String[] args) {
        menghitung tulisan = new menghitung();
        tulisan.LembarBuku(50);
        tulisan.HalamanBuku(100);
        tulisan.Banyakhari();
        tulisan.tampilan();
    }
}
