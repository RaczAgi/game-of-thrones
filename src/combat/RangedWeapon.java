package combat;

import combat.type.RangedWeaponType;

public class RangedWeapon extends Weapon {
    protected RangedWeaponType type;
    private int ammunition;

    @Override
    public void attack() {
        ammunition--;
    }

    public RangedWeapon(RangedWeaponType type, int ammunition) {
        this.type = type;
        this.ammunition = ammunition;
    }

    public RangedWeaponType getType() {
        return type;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setType(RangedWeaponType type) {
        this.type = type;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    @Override
    public String toString() {
        return "RangedWeapon{" +
                "type=" + type +
                ", ammunition=" + ammunition +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }
}
