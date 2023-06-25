package combat;

import combat.type.RangedWeaponType;

public class RangedWeapon extends Weapon {
    protected RangedWeaponType Type;
    private int ammunition;

    @Override
    public void attack() {
        ammunition--;
    }

    public RangedWeapon(String name, int damage, int ammunition, RangedWeaponType Type) {
        super.name = name;
        super.damage = damage;
        this.ammunition = ammunition;
        this.Type = Type;

    }

    public RangedWeaponType getType() {
        return Type;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setType(RangedWeaponType Type) {
        this.Type = Type;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    @Override
    public String toString() {
        return "RangedWeapon{" +
                "RangedWeaponType=" + this.Type +
                ", ammunition=" + this.ammunition +
                ", name='" + super.name +
                ", damage=" + super.damage +
                ", range=" + super.range +
                '}';
    }
}
