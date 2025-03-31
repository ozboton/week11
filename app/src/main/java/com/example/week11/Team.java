package com.example.week11.data.model;

public class Team implements SoccerEntity {
    private String name, country, league, stadium;
    private int foundingYear;

    public Team(String name, String country, String league, String stadium, int foundingYear) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name required");
        this.name = name;
        this.country = country;
        this.league = league;
        this.stadium = stadium;
        this.foundingYear = foundingYear;
    }

    @Override
    public String getId() {
        return name + ":" + country;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getLeague() { return league; }
    public String getCountry() { return country; }
    public String getStadium() { return stadium; }
    public int getFoundingYear() { return foundingYear; }
}
