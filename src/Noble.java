public class Noble extends Character {
    House house;
    int wealth;

    @Override
    public String toString() {
        return "Noble{" +
                "house=" + house +
                ", wealth=" + wealth +
                '}';
    }

}
