package combat;

import character.Character;

import java.util.Calendar;

public abstract class Weapon {
    protected String name;
    protected int damage;
    protected int range;


    public Weapon(String name, int damage, int range){
        this.name = name;
        this.damage = damage;
        this.range = range;
    }
    public void attack(Character character, Character enemy){}

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public abstract void attack();

    public abstract boolean isRanged();

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }
}
