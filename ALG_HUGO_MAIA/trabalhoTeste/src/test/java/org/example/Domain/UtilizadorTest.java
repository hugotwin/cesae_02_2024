package org.example.Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilizadorTest {


    private Utilizador utilizador;

    @BeforeEach
    void setUp() {
        utilizador = new Utilizador();
    }

    @Test
    void getNomeTeste() {

        assertNotNull(utilizador.getNome());// Falta completar funcao
    }

    @Test
    void getSenhaTeste() {

        assertNotNull(utilizador.getSenha());// Falta completar funcao
    }
}