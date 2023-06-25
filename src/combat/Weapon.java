package combat;

public abstract class Weapon {
    protected String name;
    protected int damage;
    protected int range;

    public void attack(){}

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }


}
