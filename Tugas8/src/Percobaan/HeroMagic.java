package Percobaan;

public class HeroMagic extends Hero {
    public String power;

    public HeroMagic(String name, double health) {
        super(name, health);
        this.power = "Magic";
    }

    @Override
    public void display() {
        System.out.println(this.getName() + " adalah Hero dengan kekuatan " + this.power + ".");
    }
}
