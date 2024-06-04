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

    public  ArrayList<Player> getPlayersList() throws FileNotFoundException {

        ArrayList<Player> playersArray = PlayerRepository.getInstance().getPlayersArray();
        for (Player player : playersArray) {

            System.out.println(player.getName());


                  }

        return playersArray; // alterei para retornar um array

    }

    public ArrayList<Competition> getCompetitions() throws FileNotFoundException {

        ArrayList<Competition> competitionsArray = CompetitionsRepository.getInstance().getCompetitionsArray();
        for (Competition competition : competitionsArray) {
            if (competition.getOurGoals() > competition.getTheirGoals()) {
                System.out.println(competition.getCompetition());

            }
        }

        return competitionsArray;
    }



    public void showMostGoalsOnCompetion() throws FileNotFoundException {}




}

