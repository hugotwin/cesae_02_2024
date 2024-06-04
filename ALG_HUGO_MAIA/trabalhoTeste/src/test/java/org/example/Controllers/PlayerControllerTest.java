package org.example.Controllers;

import org.example.Domain.Competition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.example.Domain.Player;
import static org.junit.jupiter.api.Assertions.*;

class PlayerControllerTest {

    private PlayerController playerController;

    @BeforeEach
    void setUp() {

        playerController = new PlayerController();
    }

    @Test
    void getPlayersListTeste() throws FileNotFoundException {

        assertEquals(36,  playerController.getPlayersList().size());
        playerController.getPlayersList().clear();
        assertTrue(playerController.getPlayersList().isEmpty());
    }


    @Test
    void getPlayersListNomeTeste() throws FileNotFoundException {
       ArrayList<Player> lista = playerController.getPlayersList();
        assertEquals("Joaquim Alberto",  lista.get(0).getName());
    }



    @Test
    void getCompetitionsTeste() throws FileNotFoundException {

        assertEquals(63,  playerController.getCompetitions().size());
        playerController.getCompetitions().clear();
        assertTrue(playerController.getCompetitions().isEmpty());
        assertNotNull( playerController.getCompetitions());
    }


    @Test
    void getPlayerCompetionNomeTeste() throws FileNotFoundException {
        ArrayList<Competition> lista = playerController.getCompetitions();
        assertEquals("Champions League",  lista.get(0).getCompetition());
    }

    @Test
    void getPlayerCompetionNotNomeTeste() throws FileNotFoundException {
        ArrayList<Competition> lista = playerController.getCompetitions();
        assertNotEquals("Champions",  lista.get(0).getCompetition());
        assertNotEquals("",  lista.get(1).getCompetition());
        assertThrows(IndexOutOfBoundsException.class,()-> lista.get(3000).getCompetition());
    }

    @Test
    void getPlayerCompetionNotNomeTesteOutBounds() throws FileNotFoundException {
        ArrayList<Competition> lista = playerController.getCompetitions();
        assertDoesNotThrow(IndexOutOfBoundsException.class,lista.get(3000).getCompetition());
    }

    private void assertDoesNotThrow(Class<IndexOutOfBoundsException> indexOutOfBoundsExceptionClass, Object o) {
    }


}