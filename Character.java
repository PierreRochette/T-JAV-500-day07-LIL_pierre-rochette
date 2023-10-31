public abstract class Character implements Movable {

    protected String name;
    protected final String RPGClass;
    protected int life;
    protected int agility;
    protected int strength;
    public int wit;

    protected Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    public String getName() {return name; }
    public String getRPGClass() { return RPGClass; }
    public int getLife() {return life ; }
    public int getAgility() {
        return agility;
    }
    public int getStrength() {return strength; }
    public int getWit() {return wit;}
    public void attack(String argument) {
        System.out.println(name + ": Rrrrrrrrr....");
    }

    @Override
    public void moveRight() {
        System.out.println(getName() + ": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName() + ": moves left");
    }
    @Override
    public void moveForward() {
        System.out.println(getName() + ": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(getName() + ": moves back");
    }

    public final void unsheathe() {
        System.out.println(getName() + ": unsheathes his weapon.");
    }
}
