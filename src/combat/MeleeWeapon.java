package combat;

import combat.type.MeleeWeaponType;

public class MeleeWeapon extends Weapon {


    protected MeleeWeaponType Type;



    public MeleeWeapon(String name, int damage, MeleeWeaponType Type) {
        super(name, damage, 1);
        this.Type = Type;
    }

    @Override
    public void attack() {

    }

    @Override
    public boolean isRanged() {
        return false;
    }

    @Override
    public String toString() {
        return "combat.MeleeWeapon{" +
                "MeleeWeaponType=" + this.Type +
                ", name='" + super.name +
                ", damage=" + super.damage +
                ", range=" + super.range +
                '}';
    }
}
