package org.example.Tools;

import org.example.Domain.Competition;
import org.example.Domain.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
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
    void readCsvFileToArrayTestedsize() throws FileNotFoundException {

        assertEquals(36, CSVPlayerReader.readCsvFileToArray("Files/jogadores.csv").size());

    }

    @Test
    void readCsvFileToArrayEmptyFile() throws FileNotFoundException {

        ArrayList<Player> players = CSVPlayerReader.readCsvFileToArray("Files/jogadoresVazio.csv");

        assertEquals(0, players.size());
    }// falha de teste devesse verificar se o ficheiro esta vazio











}