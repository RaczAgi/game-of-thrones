public enum House {
    STARK ("Közeleg a tél", "Winter is comming", "wolf"),
    LANNISTER ("Halld üvöltésem", "Hear Me Roar", "lion"),
    TARGARYEN ( "Tűz és vér", "Fire and Blood", "dragon"),
    BARATHEON ("Miénk a harag", "Ours if the Fury", "stag"),
    GREYJOY ("Mi nem vetünk", "We Do Not Show", "kraken"),
    TYRELL ("Erőssé növünk", "Growing Strong", "rose");
    private String magyarJelmondat;
    private String angolJelmondat;
    private String sigil;

    House(String magyarJelmondat, String angolJelmondat, String sigil) {
        this.magyarJelmondat = magyarJelmondat;
        this.angolJelmondat = angolJelmondat;
        this.sigil = sigil;
    }


}
