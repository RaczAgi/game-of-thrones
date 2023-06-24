public abstract class Noble extends Character {
    private final House houses;
    private int wealth;

    public Noble(String name, String birthPlace, Gender gender, House houses, int wealth) {
        super(name, birthPlace, gender);
        this.houses = houses;
        this.wealth = wealth;
    }

    public House getHouse() {
        return houses;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    @Override
    public String toString() {
        return "Noble{" +
                "name='" + name + '\''+
                "of house=" + houses +
                "has wealth=" + wealth +
                '}';
    }
}
