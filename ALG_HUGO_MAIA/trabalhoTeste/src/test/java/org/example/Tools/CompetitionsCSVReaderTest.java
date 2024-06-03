package org.example.Tools;

import org.example.Domain.Competition;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.example.Tools.CompetitionsCSVReader.readCsvFileToArray;
import static org.junit.jupiter.api.Assertions.*;

class CompetitionsCSVReaderTest {


    private CompetitionsCSVReader competitionsCSVReader;



    @BeforeEach
    void setUp() {



    }

    @Test
    void readCsvFileToArrayTeste() {

        assertThrows(FileNotFoundException.class, ()->CompetitionsCSVReader.readCsvFileToArray("teste"));

    }






    @Test
    void readCsvFileFileFound() throws FileNotFoundException {

        ArrayList<Competition> competitions = CompetitionsCSVReader.readCsvFileToArray("main/resources/Files/competicoes.csv");

       assertInstanceOf(Competition.class, competitions.get(0));

    }










}