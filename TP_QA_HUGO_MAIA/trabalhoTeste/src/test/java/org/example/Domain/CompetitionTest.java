package org.example.Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompetitionTest {


    private Competition competition;
    @BeforeEach
    void setUp() {
        competition =new Competition("2024-06-03", "Liga", "porto", 2, 1);

    }

    @Test
    public void testCompetitionConstructor() {

        assertNotNull(competition);
        assertEquals("2024-06-03", competition.getDate());
        assertEquals("liga", competition.getCompetition());
        assertEquals("porto", competition.getAdversary());
        assertEquals(2, competition.getOurGoals());
        assertEquals(1, competition.getTheirGoals());


    }

    @Test
    void testConstructorWithNull() {

        assertThrows(NullPointerException.class, () -> new Competition(null, "League", "Opponent", 2, 1));
        assertThrows(NullPointerException.class, () -> new Competition("2024-06-03", null, "Opponent", 2, 1));
        assertThrows(NullPointerException.class, () -> new Competition("2024-06-03", "League", null, 2, 1));
    }

    @Test
    void showDetails() {

        String details = competition.showDetails();
        assertNotNull(details);
        assertTrue(details instanceof String);


    }

    @Test
    void getDate() {
        assertEquals("2024-06-03", competition.getDate());
        assertNotEquals("2024-06-01", competition.getDate());

    }

    @Test
    void getCompetition() {
        assertEquals("Liga", competition.getCompetition());
        assertNotEquals("distritais", competition.getCompetition());
        assertNotEquals("", competition.getCompetition());
        assertNotEquals("liga", competition.getCompetition());
    }

    @Test
    void getAdversary() {
        assertEquals("porto", competition.getAdversary());
        assertNotEquals("Porto", competition.getAdversary());
        assertNotEquals("", competition.getAdversary());

    }

    @Test
    void getOurGoals() {

        assertEquals(2, competition.getOurGoals());
        assertNotEquals(3, competition.getOurGoals());
        assertNotEquals(0, competition.getOurGoals());
        assertNotEquals(-2, competition.getOurGoals());
    }

    @Test
    void getTheirGoals() {

        assertEquals(1, competition.getTheirGoals());
        assertNotEquals(0, competition.getTheirGoals());
        assertNotEquals(-1, competition.getTheirGoals());



    }
}