class Perpustakaan{
    String buku1;
    String penulis1;
    String buku2;
    String penulis2;
    String buku3;
    String penulis3;
    String buku4;
    String penulis4;
    String buku5;
    String penulis5;

    void judulB1(String b, String p){
        buku1 = b;
        penulis1 = p;
    }
    void judulB2(String b, String p){
        buku2 = b;
        penulis2 = p;
    }
    void judulB3(String b, String p){
        buku3 = b;
        penulis3 = p;
    }
    void judulB4(String b, String p){
        buku4 = b;
        penulis4 = p;
    }  
    void judulB5(String b, String p){
        buku5 = b;
        penulis5 = p;
    }
    void tampilan() {
        System.out.print("Buku 1 berjudul " + buku1);
        System.out.println(" yang ditulis oleh " + penulis1);
        System.out.print("Buku 2 berjudul " + buku2);
        System.out.println(" yang ditulis oleh " + penulis2);
        System.out.print("Buku 3 berjudul " + buku3);
        System.out.println(" yang ditulis oleh " + penulis3);
        System.out.print("Buku 4 berjudul " + buku4);
        System.out.println(" yang ditulis oleh " + penulis4);
        System.out.print("Buku 5 berjudul " + buku5);
        System.out.println(" yang ditulis oleh " + penulis5);
    }

}

public class MainPerpustakaan {
    public static void main(String[] args) {
        System.out.println("SELAMAT DANG DI PERPUSTAKAAN X");
        System.out.println("Berikut jenis-jenis buku yang tersedia di perpustakaan kami :");
        System.out.println();
        System.out.println();

        Perpustakaan Teknologi = new Perpustakaan();
        System.out.println("--BUKU TEKNOLOGI--");
        Teknologi.judulB1("-Revolutionizing Tomorrow: The Impact of Artificial Intelligence-", "John A. Smith");  
        Teknologi.judulB2("-Tech Titans: Innovators Who Shaped the Digital Age-","Walter Isaacson");
        Teknologi.judulB3("-The Future Code: Navigating the Digital Landscape-","Sarah J. Anderson");
        Teknologi.judulB4("-Rise of the Machines: A Journey into the World of Robotics-","Mark W. Johnson");
        Teknologi.judulB5("-The Quantum Leap: Exploring the Frontiers of Quantum Computing-"," Emily K. Davis");
        Teknologi.tampilan();
        System.out.println();

        Perpustakaan Filsafat = new Perpustakaan();
        System.out.println("--BUKU FILSAFAT--");
        Filsafat.judulB1("-Meditations-", "Marcus Aurelius");
        Filsafat.judulB2("-Being and Time-", "Martin Heidegger");
        Filsafat.judulB3("-Critique of Pure Reason-", "Immanuel Kant");
        Filsafat.judulB4("-Thus Spoke Zarathustra-", "Friedrich Nietzsche");
        Filsafat.judulB5("-The Republic-", "Plato");
        Filsafat.tampilan();
        System.out.println();

        Perpustakaan Sejarah = new Perpustakaan();
        System.out.println("--BUKU SEJARAH--");
        Sejarah.judulB1("-A Short History of Nearly Everything-", "Bill Bryson");
        Sejarah.judulB2("-A People's History of the United States-", "Howard Zinn");
        Sejarah.judulB3("-The Guns of August-", "Barbara W. Tuchman");
        Sejarah.judulB4("-Guns, Germs, and Steel: The Fates of Human Societies-", "Jared Diamond");
        Sejarah.judulB5("-The Second World War-", "Sir Winston S. Churchill");
        Sejarah.tampilan();
        System.out.println();

        Perpustakaan Agama = new Perpustakaan();
        System.out.println("--BUKU AGAMA--");
        Agama.judulB1("-he World's Religions-", "Huston Smith");
        Agama.judulB2("-A History of God-", "Karen Armstrong");
        Agama.judulB3("-The Varieties of Religious Experience-", "William James");
        Agama.judulB4("-The Tao of Pooh-", "Benjamin Hoff");
        Agama.judulB5("-The Art of Happiness-", " Dalai Lama dan Howard Cutler");
        Agama.tampilan();
        System.out.println();

        Perpustakaan Psikologi = new Perpustakaan();
        System.out.println("--BUKU PSIKOLOGI--");
        Psikologi.judulB1("-Thinking, Fast and Slow-", "Daniel Kahneman");
        Psikologi.judulB2("-Man's Search for Meaning-", "Viktor E. Frankl");
        Psikologi.judulB3("-The Interpretation of Dreams-", "Sigmund Freud");
        Psikologi.judulB4("-Influence: The Psychology of Persuasion-", "Robert B. Cialdini");
        Psikologi.judulB5("-Quiet: The Power of Introverts in a World That Can't Stop Talking-", "Susan Cain");
        Psikologi.tampilan();
        System.out.println();

        Perpustakaan Politik = new Perpustakaan();
        System.out.println("--BUKU POLITIK--");
        Politik.judulB1("-The Republic-", "Plato");
        Politik.judulB2("-The Prince-", "Niccolò Machiavelli");
        Politik.judulB3("-he Social Contract-", "Jean-Jacques Rousseau");
        Politik.judulB4("-The Communist Manifesto-", "Karl Marx dan Friedrich Engels");
        Politik.judulB5("-The Road to Serfdom-", "Friedrich Hayek");
        Politik.tampilan();
        System.out.println();

        Perpustakaan Fiksi = new Perpustakaan();
        System.out.println("--BUKU FIKSI--");
        Fiksi.judulB1("-To Kill a Mockingbird-", "Harper Lee");
        Fiksi.judulB2("-1984-", "George Orwell");
        Fiksi.judulB3("-One Hundred Years of Solitude-", "Gabriel García Márquez");
        Fiksi.judulB4("-The Great Gatsby-", "F. Scott Fitzgerald");
        Fiksi.judulB5("-The Catcher in the Rye-", "J.D. Salinger");
        Fiksi.tampilan();
        System.out.println();
        System.out.println("byebye");
    }
}
