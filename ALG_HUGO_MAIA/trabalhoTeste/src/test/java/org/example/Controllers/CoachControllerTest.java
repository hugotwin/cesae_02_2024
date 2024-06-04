package org.example.Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.IllegalFormatException;

import static org.junit.jupiter.api.Assertions.*;

class CoachControllerTest {

    private CoachController coachController;


    @BeforeEach
    void setUp() throws FileNotFoundException {

        coachController = new CoachController();

    }

    @Test
    void testCompetitionsByYear_withCompetitionsFalse() {
       assertFalse( coachController.competitionsByYear(0));
        assertFalse( coachController.competitionsByYear(-1));
        assertFalse( coachController.competitionsByYear(2050));
    }

    @Test
    void testCompetitionsByYear_withCompetitionsTrue() {
        assertTrue( coachController.competitionsByYear(2020));
        assertTrue( coachController.competitionsByYear(2021));

    }


    /*
    @Test
    void testCompetitionsByYear_withCompetitionsString() {
        assertThrows(IllegalArgumentException.class, () -> coachController.competitionsByYear("null"));
    }// deveriar ter um illegal argument exception ou entao receber os doistipos de dados

*/







}