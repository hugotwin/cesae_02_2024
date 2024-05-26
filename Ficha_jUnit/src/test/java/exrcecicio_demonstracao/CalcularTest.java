package exrcecicio_demonstracao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcularTest {


    private Calcular calcular;


    @BeforeEach

    public void setUp(){

        calcular= new Calcular();
    }

    @Test
    void testAdd() {
        assertEquals(4, calcular.add(2,2));

               

    }
}