public class Mage extends Character {
    public Mage(String name) {
        super(name, 100, 10, 8, 3, "Mage");
        System.out.println(this.name + ": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) {
        System.out.println(this.name + ": Rrrrrrrrr....");
        System.out.println(this.name + ": Feel the power of my " + weapon + "!");
    }
}
