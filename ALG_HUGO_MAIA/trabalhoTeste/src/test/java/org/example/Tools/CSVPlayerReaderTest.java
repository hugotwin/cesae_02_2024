package org.example.Tools;

import org.example.Domain.Competition;
import org.example.Domain.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CSVPlayerReaderTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void readCsvFileToArray() {
    }


    @Test
    void readCsvFileToArrayTeste() {

        assertThrows(FileNotFoundException.class, ()->CSVPlayerReader.readCsvFileToArray("teste"));

    }

    @Test
    void readCsvFileFileFound() throws FileNotFoundException {

        ArrayList<Player> players = CSVPlayerReader.readCsvFileToArray("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\trabalhoTeste\\src\\main\\resources\\Files\\jogadores.csv");

        assertInstanceOf(Competition.class, players.get(0));

    }






}