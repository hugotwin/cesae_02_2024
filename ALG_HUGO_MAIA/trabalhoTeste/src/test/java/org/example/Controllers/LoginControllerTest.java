package org.example.Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginControllerTest {

    private LoginController loginController;

    @BeforeEach
    void setUp() {
        loginController = new LoginController();

    }

    @Test
    void autenticacaoLoginTeste() {

        assertTrue(loginController.autenticacaoLogin());
        assertNotNull(loginController.autenticacaoLogin());// a funcao necessita de ser acabada não tem conteudo

    }
}