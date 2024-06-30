package org.example.Model;

import org.example.Domain.*;
import org.example.Tools.CSVPlayerReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PlayerRepository {

    private static PlayerRepository instance;
    private ArrayList<Player> playersArray;

    private PlayerRepository() throws FileNotFoundException {

        this.playersArray = CSVPlayerReader.readCsvFileToArray("Files/jogadores.csv");
    }

    public static org.example.Model.PlayerRepository getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new org.example.Model.PlayerRepository();
        }
        return instance;
    }

    public ArrayList<Player> getPlayersArray() {
         return playersArray;
    }
}