package combat;

import combat.type.MeleeWeaponType;

public class MeleeWeapon extends Weapon {


    protected MeleeWeaponType Type;
    @Override
    public int getRange() {
        return 1;
    }

    public MeleeWeapon(String name, int damage, MeleeWeaponType Type) {
        super.name = name;
        super.damage = damage;
        this.Type = Type;
    }

    public MeleeWeaponType getType() {
        return Type;
    }

    @Override
    public String toString() {
        return "MeleeWeapon{" +
                "MeleeWeaponType=" + this.Type +
                ", name='" + this.name +
                ", damage=" + super.damage +
                ", range=" + super.range +
                '}';
    }
}
