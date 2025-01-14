package combat;

import combat.type.RangedWeaponType;

public class RangedWeapon extends Weapon {
    protected RangedWeaponType Type;
    private int ammunition;

    @Override
    public void attack() {
        ammunition--;
    }

    public RangedWeapon(String name, int damage,  int range, int ammunition,RangedWeaponType Type) {
        super(name, damage, range);
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


    @Override
    public boolean isRanged() {
        return false;
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
