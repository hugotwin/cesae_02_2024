package exercicio3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private  Animal animal;

    @BeforeEach
    public  void setUp(){

        animal= new Animal("vaca", Alimento.VEGETAIS);
    }

    @Test
    void getNome() {

        assertEquals("vaca",animal.getNome());

    }

    @Test
    void estaComFome() {
        assertEquals(true,animal.estaComFome());
    }

    @Test
    void getTipoAlimentacao() {

        assertEquals(Alimento.VEGETAIS,animal.getTipoAlimentacao());
    }

    @Test
    void comerTrue() {

        assertTrue( animal.comer(Alimento.VEGETAIS));
        assertEquals(false,animal.estaComFome());
    }


    @Test
    void comerFalse() {
        assertFalse( animal.comer(Alimento.FRUTAS));
        assertFalse( animal.comer(Alimento.PEIXE));
        assertFalse( animal.comer(Alimento.CARNE));
        assertEquals(true,animal.estaComFome());

    }
}