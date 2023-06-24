public enum House {
    STARK ("Közeleg a tél", "Winter is comming", "wolf"),
    LANNISTER ("Halld üvöltésem", "Hear Me Roar", "lion"),
    TARGARYEN ( "Tűz és vér", "Fire and Blood", "dragon"),
    BARATHEON ("Miénk a harag", "Ours if the Fury", "stag"),
    GREYJOY ("Mi nem vetünk", "We Do Not Show", "kraken"),
    TYRELL ("Erőssé növünk", "Growing Strong", "rose");
    private final String magyarJelmondat;
    private final String angolJelmondat;
    private final String sigil;

    House(String magyarJelmondat, String angolJelmondat, String sigil) {
        this.magyarJelmondat = magyarJelmondat;
        this.angolJelmondat = angolJelmondat;
        this.sigil = sigil;
    }

    public String getMagyarJelmondat() {
        return magyarJelmondat;
    }

    public String getAngolJelmondat() {
        return angolJelmondat;
    }

    public String getSigil() {
        return sigil;
    }
    public String toString(){
        return this.name();
    }


}
