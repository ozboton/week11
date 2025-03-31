package com.example.week11.data.model;

public class Player implements SoccerEntity {
    private String name, nationality, position, team;
    private int age, number;

    public Player(String name, int age, String nationality, String position, String team, int number) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.team = team;
        this.number = number;
    }

    @Override
    public String getId() {
        return name + ":" + number;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

}
