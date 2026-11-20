public class TestCharacter {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Jean-Luc");
        Mage mage = new Mage("Robert");

        warrior.attack("hammer");
        mage.attack("magic");
    }
}
