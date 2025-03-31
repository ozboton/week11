package com.example.week11.data.model;

public class Match implements SoccerEntity {
    private String homeTeam, awayTeam, score, league, date, stadium;

    public Match(String homeTeam, String awayTeam, String score, String league, String date, String stadium) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = score;
        this.league = league;
        this.date = date;
        this.stadium = stadium;
    }

    @Override
    public String getId() {
        return homeTeam + "_vs_" + awayTeam;
    }

    @Override
    public String getName() {
        return homeTeam + " vs " + awayTeam;
    }

    public String getScore() {
        return score;
    }

    public String getLeague() {
        return league;
    }

    public String getDate() {
        return date;
    }

    public String getStadium() {
        return stadium;
    }

}
