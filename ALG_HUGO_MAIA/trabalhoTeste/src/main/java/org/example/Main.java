package org.example;


import org.example.Views.CoachView;
import org.example.Views.PlayerView;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PlayerView playerView = new PlayerView();
        CoachView coachView = new CoachView();
        playerView.playerMenu();
        coachView.coachMenu();

    }
}
