package combat;

import combat.type.MeleeWeaponType;

public class MeleeWeapon extends Weapon {

    MeleeWeaponType type;
    @Override
    public int getRange() {
        return 1;
    }

    public MeleeWeapon(MeleeWeaponType type) {
        this.type = type;
    }

    public MeleeWeaponType getType() {
        return type;
    }

    public void setType(MeleeWeaponType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MeleeWeapon{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }
}
