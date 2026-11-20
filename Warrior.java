public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 100, 10, 8, 3, "Warrior");
        System.out.println(this.name + ": My name will go down in history!");
    }

    @Override
    public void attack(String weapon) {
        System.out.println(this.name + ": Rrrrrrrrr....");
        System.out.println(this.name + ": I'll crush you with my " + weapon + "!");
    }
}