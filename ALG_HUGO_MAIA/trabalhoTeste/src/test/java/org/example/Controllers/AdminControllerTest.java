package org.example.Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminControllerTest {


    private AdminController adminController;

    @BeforeEach
    void setUp() {
        adminController = new AdminController();
    }

    @Test
    void valorTotalEquipaTeste() {

        assertEquals( 4493500, adminController.valorTotalEquipa());
        assertNotNull( adminController.valorTotalEquipa());//Funcao não esta completa

    }

    @Test
    void jogadorMaisCaroTeste() {


        assertEquals( "Cristiano Ronaldo", adminController.jogadorMaisCaro());//Funcao não esta completa
        assertNotNull( adminController.jogadorMaisCaro());


    }

    @Test
    void jogadorMaisBaratoTeste() {


        assertEquals( "Joaquim Alberto", adminController.jogadorMaisBarato());//Funcao não esta completa
        assertNotNull( adminController.jogadorMaisBarato());
    }






}

