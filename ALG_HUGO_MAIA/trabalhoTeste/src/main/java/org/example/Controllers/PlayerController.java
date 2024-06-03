package org.example.Controllers;

import org.example.Domain.Competition;
import org.example.Domain.Player;
import org.example.Model.CompetitionsRepository;
import org.example.Model.PlayerRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PlayerController {

    public PlayerController() {
    }

    public void getPlayersList() throws FileNotFoundException {

        ArrayList<Player> playersArray = PlayerRepository.getInstance().getPlayersArray();
        for (Player player : playersArray) {

            System.out.println(player.getName());
        }

    }

    public void getCompetitions() throws FileNotFoundException {

        ArrayList<Competition> competitionsArray = CompetitionsRepository.getInstance().getCompetitionsArray();
        for (Competition competition : competitionsArray) {
            if (competition.getOurGoals() > competition.getTheirGoals()) {
                System.out.println(competition.getCompetition());
            }
        }

    }
}

