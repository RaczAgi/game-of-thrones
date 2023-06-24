public abstract class Character implements Mortal {
    protected String name;
    protected final String birthPlace;
    protected Gender gender;
    private int counter = 0;

    public void getWorldPopulation(){
        System.out.println(counter);

    }


    public Character(String name, String birthPlace, Gender gender) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
        counter++;
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
}
