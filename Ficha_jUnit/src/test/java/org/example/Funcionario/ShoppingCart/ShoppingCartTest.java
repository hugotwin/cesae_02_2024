package org.example.Funcionario.ShoppingCart;

import org.example.ShoppingCart.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setUp(){
     shoppingCart = new ShoppingCart("1");

    }

@Test
    public void testeConstrutor(){

    assertEquals(0, shoppingCart.getItemCount());

    }


    @Test
    void addItem() {

        shoppingCart.addItem("teste");
        assertEquals(1,shoppingCart.getItemCount());
        assertTrue(shoppingCart.containsItem("teste"));

    }

    @Test
    void removeItem() {
        shoppingCart.addItem("teste");
        shoppingCart.removeItem("teste");
        assertEquals(0,shoppingCart.getItemCount());
        assertFalse(shoppingCart.containsItem("teste"));

    }

    @Test
    void containsItem() {
        shoppingCart.addItem("teste2");
        //assertFalse(shoppingCart.containsItem("valor"));
        assertTrue(shoppingCart.containsItem("teste2"));

    }

    @Test
    void getItemCount() {
        shoppingCart.addItem("teste3");
        assertEquals(2,shoppingCart.getItemCount());


    }

    @Test
    void clearCart() {
        shoppingCart.addItem("teste3");
        shoppingCart.clearCart();
        assertEquals(0,shoppingCart.getItemCount());



    }
}