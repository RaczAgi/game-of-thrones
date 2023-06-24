import combat.Weapon;

import java.util.HashSet;
import java.util.Set;
public class Noble extends Character {
    private final Set<House> houses = new HashSet<>();
    private int wealth;

    public Noble(String name, String birthPlace, Gender gender, Set<House> houses, int wealth) {
        super(name, birthPlace, gender);
        this.wealth = wealth;

    }


    public Set<House> getHouse() {
        return houses;
    }

    public void addHouse(House house){
        this.houses.add(house);
    }
    public void removeHouse(House house){
        this.houses.remove(house);
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    private String getHousesAsString(){
        String outHouses = "";
        for (House house : houses) {
            outHouses += house + ",";
        }
        return outHouses.substring(0,outHouses.length());
    }

    @Override
    public String toString() {

        return getName() +
                " of house (s) " + getHousesAsString()+
                " has " + getWealth() + " gold dragons";
    }

    @Override
    public void die() {
        for (var actual : houses){
            System.out.println(actual.getAngolJelmondat());
        }
        super.die();
    }
}
