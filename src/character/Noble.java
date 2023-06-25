package character;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

import character.Character;
import character.type.Gender;
import character.type.House;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
public class Noble extends Character {
    private Set<House> houses = new HashSet<House>();
    Map<String, Integer> coins = new HashMap<>();
    private  int totalWealth = 0;

    public Noble(String name, String birthPlace, Gender gender, Set<House> houses) {
        super(name, birthPlace, gender);
        this.houses = houses;
    }
    public void addCoins(String coinType, int amount){
        this.coins.put(coinType, amount);
    }
    public void removeCoins(String coinType, int amount){
        this.coins.remove(coinType, amount);
    }
    public int getTotalWealth(){
        for (var actual : coins.entrySet()) {
            String coinType = actual.getKey();
            int amount = actual.getValue();
            switch (coinType) {
                case "gold" -> totalWealth += amount * 100;
                case "silver" -> totalWealth += amount * 10;
                case "copper" -> totalWealth += amount;
            }}
        return totalWealth;
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


    private String getHousesAsString(){
        String outHouses = "";
        for (House house : houses) {
            outHouses += house + ",";
        }
        return outHouses.substring(0,outHouses.length()-1);
    }

    @Override
    public String toString() {

        return getName() +
                " of house(s) " + getHousesAsString()+
                " has " + getTotalWealth() + " wealth in copper."; //totalWealth + " gold dragons";
    }

    @Override
    public void die() {
        for (var actual : houses){
            System.out.println(actual.getAngolJelmondat());
        }
        super.die();
    }
}
