package org.example.Funcionario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {


    private Funcionario funcionario;

    @BeforeEach
    public void setUp(){


        funcionario = new Funcionario("hugo", 1000, "Informatica");

    }

    @Test
    void aumentarSalario() {

        assertEquals(1100, funcionario.aumentarSalario(10));
    }

    @Test
    void exibirDados() {
    }

    @Test
    void testAumentarSalario() {
    }

    @Test
    void testExibirDados() {
    }
}