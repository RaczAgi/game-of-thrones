package character;

import character.type.FightType;
import character.type.Gender;
import combat.MeleeWeapon;
import combat.Weapon;
import combat.type.MeleeWeaponType;

import java.util.HashSet;
import java.util.Set;

public abstract class Character implements Mortal {
    protected String name;
    protected final String birthPlace;
    protected Gender gender;
    private static int wordPopulation = 0;
    Set<combat.Weapon> weapons =  new HashSet<>();
    private int health = 100;


    public Character(String name, String birthPlace, Gender gender) {
        wordPopulation++;
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirthPlace() {
        return birthPlace;
    }
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (this.gender == Gender.MALE && gender == Gender.EUNUCH) {
            this.gender = gender; // vagy this.gender = character.type.Gender.EUNUCH
        }
    }
    public void castration(){
        if(this.gender == Gender.MALE){
            this.gender = Gender.EUNUCH;
        }
    }
    public static int getWordPopulation() {
        return wordPopulation;
    }

    @Override
    public void die() {
        wordPopulation--;
    }
    public void addWeapon(combat.Weapon weapon){
        weapons.add(weapon);
    }
    public void removeWeapon(String name){
        weapons.remove(name);
    }
    public Set<Weapon> getWeapons() {
        return weapons;
    }

    public boolean hasWeapons(){
        return weapons.size() > 0;}

    private void initiateFight(Weapon weapon, Character enemy, FightType fightType) {
        String fightTypeName = fightType == FightType.MELEE ? "melee" : "ranged";
        System.out.println(this.getName() + " engages in " + fightTypeName + " combat with " + enemy.getName() + ".");
        weapon.attack(this, enemy);
    }
    public void fight(Character enemy, FightType fightType) {
        if (this.hasWeapons()) {
            for (Weapon weapon : this.getWeapons()) {
                if ((fightType == FightType.MELEE && !weapon.isRanged()) ||
                        (fightType == FightType.RANGED && weapon.isRanged())) {
                    initiateFight(weapon, enemy, fightType);
                }
            }
        } else {
            System.out.println(this.getName() + " has no weapons to fight with.");
        }
    }
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.getName() + "'s health dropped to " + this.health + "/100.");
    }

}
