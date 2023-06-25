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
    private Set<Weapon> weapons =  new HashSet<>();


    public Character(String name, String birthPlace, Gender gender) {
        wordPopulation++;
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;


    }

    public String getName() {
        return name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (this.gender == Gender.MALE && gender == Gender.EUNUCH) {
            this.gender = gender; // vagy this.gender = Gender.EUNUCH
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
    public Set<Weapon> getWeapons() {return weapons;}

    public void setWeapons(Set<Weapon> weapons) {
        this.weapons = weapons;
    }

    public void addWeapon(Weapon weapon){
        this.weapons.add(weapon);
    }
    public void removeWeapon(String name){
        this.weapons.remove(name);
    }

    public boolean hasWeapons(){
        return false;}


}
