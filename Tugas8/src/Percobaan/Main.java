package Percobaan;

public class Main {
    public static void main(String[] args) {
    //casting
    //double angka = 5.4;
    //int angka_int = (int)angka;
    //System.out.println(angka_int);
    //Object dengan class HeroIntel
    HeroIntel hero1 = new HeroIntel("Ucup",100);
    hero1.display();
    //upcasting
    Hero heroUp = (Hero)hero1;
    heroUp.display();
    //System.out.println(heroUp.getType()); //ini error
    //Object dgn class Hero
    Hero heroReg = new Hero("Boy",100);
    heroReg.display();
    //downcasting
    //HeroAgility heroDown = (HeroAgility) heroReg; //ini error
    //heroDown.display();
    //heroUp dikembalikan ke hero1
    HeroIntel hero2 = (HeroIntel) heroUp;
    hero2.display(); //ini berhasil downcasting
    // nomor 3
    // HeroAgility hero3 = (HeroAgility) heroUp;
    // hero3.display();

    // nomor 4
    System.out.println("Tipe dari hero1: " + hero1.type);
    System.out.println("Tipe dari hero2: " + hero2.type);

    // nomor 5
    // Membuat object dengan class HeroMagic
    HeroMagic heroMagic = new HeroMagic("Gandalf", 150);
    heroMagic.display();
    System.out.println("Power heroMagic: " + heroMagic.power);
    
    // upcasting HeroMagic ke Hero
    Hero heroUpMagic = (Hero) heroMagic;
    heroUpMagic.display();
    // System.out.println("Power heroUpMagic: " + heroUpMagic.power); // ini error karena power tidak ada di class Hero
    
    // downcasting kembali ke HeroMagic
    HeroMagic heroMagicDown = (HeroMagic) heroUpMagic;
    heroMagicDown.display();
    System.out.println("Power heroMagicDown: " + heroMagicDown.power);
    }
}
