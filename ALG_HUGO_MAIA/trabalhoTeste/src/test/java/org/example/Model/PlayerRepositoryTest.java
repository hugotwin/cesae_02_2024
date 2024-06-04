package org.example.Model;

import org.example.Domain.Competition;
import org.example.Domain.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlayerRepositoryTest {

    private PlayerRepository playerRepository;

    private PlayerRepository playerRepository2;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        playerRepository = PlayerRepository.getInstance();
        playerRepository2 = PlayerRepository.getInstance();

    }

    @Test
    void getInstance() {

        assertEquals(playerRepository , playerRepository2 );

    }

    @Test
    void getPlayersArray() {
        ArrayList<Player> PlayerArray = new ArrayList<Player>();
        assertTrue(PlayerArray instanceof  ArrayList<Player>);

    }
}