package com.example.week11.data.provider;

import com.example.week11.data.model.Match;
import com.example.week11.data.model.Player;
import com.example.week11.data.model.Team;

import java.util.List;

public class DataProvider {
    public static List<Team> createSampleTeams() {
        return List.of(
                new Team("FC Barcelona", "Spain", "La Liga", "Camp Nou", 1899),
                new Team("Manchester United", "England", "Premier League", "Old Trafford", 1878),
                new Team("Bayern Munich", "Germany", "Bundesliga", "Allianz Arena", 1900),
                new Team("Juventus", "Italy", "Serie A", "Allianz Stadium", 1897),
                new Team("Paris Saint-Germain", "France", "Ligue 1", "Parc des Princes", 1970)
        );
    }

    public static List<Player> createSamplePlayers() {
        return List.of(
                new Player("Lionel Messi", 34, "Argentina", "Forward", "FC Barcelona", 10),
                new Player("Cristiano Ronaldo", 36, "Portugal", "Forward", "Juventus", 7),
                new Player("Kevin De Bruyne", 29, "Belgium", "Midfielder", "Manchester City", 17)
        );
    }

    public static List<Match> createSampleMatches() {
        return List.of(
                new Match("FC Barcelona", "Real Madrid", "2-1", "La Liga", "2023-04-10", "Camp Nou"),
                new Match("Man Utd", "Liverpool", "0-3", "Premier League", "2023-03-15", "Old Trafford")
        );
    }
}