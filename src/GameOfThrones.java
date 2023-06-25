import combat.type.MeleeWeaponType;
import combat.type.RangedWeaponType;

import java.util.HashSet;
import java.util.Set;
public class GameOfThrones {
    public static void main(String[] args) {

        System.out.println(Character.getWordPopulation());

        Character arya = new Noble("Arya", "Winterfell",
                Gender.FEMALE, Set.of(House.STARK), 30);


        System.out.println(Character.getWordPopulation());
        arya.die();
        System.out.println(Character.getWordPopulation());

        System.out.println(arya.hasWeapons()); // False

        arya.addWeapon(new combat.MeleeWeapon("Valyrian steel dagger", 20, MeleeWeaponType.DAGGER));
        arya.addWeapon(new combat.RangedWeapon("Stolen bow", 10, 40, 5, RangedWeaponType.BOW));

        arya.removeWeapon("Stolen bow");

        System.out.println(arya.getWeapons()); // [combat.MeleeWeapon{type=DAGGER, name='Valyrian steel dagger', damage=20, range=1}]
    }
}







