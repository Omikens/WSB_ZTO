package com.company;

public enum Country {
    POLAND("polish", "PL", 500000000.0),
    USA("english", "US", 50000000000.0),
    FRANCE("french", "FR", 1500000000.0),
    FINLAND("finish", "FI", 400000000.0);

    final String language;
    final String code;
    Double GDP;

    private Country(String language, String code, Double GDP) {
        this.code = code;
        this.language = language;
        this.GDP = GDP;
    }

    public Double gdpInPLN(){
        return this.GDP * 4.27;
    }
}
