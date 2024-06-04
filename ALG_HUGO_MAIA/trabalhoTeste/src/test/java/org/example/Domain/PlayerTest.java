package org.example.Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {


    private Player player;
    private Player player2;

    @BeforeEach
    void setUp() {

        player = new Player(2,"bruno",22, "Portuguesa", 5, 10, 100);
        player2 = new Player(0,"hugo",25, "Inglesa", 0, 5, 200);

    }



    @Test
    void testConstructorWithNull() {

        assertThrows(NullPointerException.class, () -> new Player(0,"bruno",22, "Portuguesa", 5, 10, 100));
        assertThrows(NullPointerException.class, () -> new Player(2,null,22, "Portuguesa", 5, 5, 100));
        assertThrows(NullPointerException.class, () -> new Player(2,"bruno",22, "null", 5, 10, 100));
    }// tramento destas exception






    @Test
    void getNumber() {

        assertEquals(2, player.getNumber());
        assertEquals(0, player2.getNumber());

    }

    @Test
    void getName() {
        assertEquals("bruno", player.getName());
        assertEquals("hugo", player2.getName());
    }

    @Test
    void getAge() {

        assertEquals(22, player.getAge());
        assertEquals(25, player2.getAge());
    }

    @Test
    void getNationality() {

        assertEquals("portuguesa", player.getNationality());
        assertEquals("Inglesa", player2.getNationality());




    }

    @Test
    void getDefenceRanking() {

        assertEquals(5, player.getDefenceRanking());
        assertEquals(0, player2.getDefenceRanking());





    }

    @Test
    void getAttackRanking() {
        assertEquals(10, player.getAttackRanking());
        assertEquals(5, player.getAttackRanking());


    }

    @Test
    void getValue() {

        assertEquals(100, player.getValue());
        assertEquals(200, player.getAttackRanking());

    }
}