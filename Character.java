public abstract class Character {
    protected String name; 
    protected int life; 
    protected int agility; 
    protected int strength;
    protected int wit; 
    protected String RPGClass;

    public Character(String name, int life, int agility, int strength, int wit, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass; 
        this.life = life;
        this.agility = agility; 
        this.strength = strength; 
        this.wit = wit;
    }
    public String getName() {
        return this.name; 
    }
    public String getRPGClass() {
        return this.RPGClass;
    }
    public int getLife() {
        return this.life;
    }
    public int getAgility() {
        return this.agility; 
    }
    public int getStrength() {
        return this.strength; 
    }
    public int getWit() {
        return this.wit; 
    }
    public void attack(String whatever) {
        System.out.println(this.name + ": Rrrrrrrrr....");
    }
}