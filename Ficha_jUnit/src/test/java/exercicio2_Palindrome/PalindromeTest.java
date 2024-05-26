package exercicio2_Palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {


    private Palindrome palindrome;


    @BeforeEach
    public void setUp() {

        palindrome = new Palindrome();
    }

    @Test
    void isPalindromeTrue() {
        assertEquals(true, Palindrome.isPalindrome("ana"));

    }


    @Test
    void isPalindromeFalse() {
        assertEquals(false, Palindrome.isPalindrome("hugo"));

    }

    @Test
    void isPalindromeMaiscula() {
        assertEquals(true, Palindrome.isPalindrome("Ana"));

    }

    @Test
    void isPalindromeAllMaiscula() {
        assertEquals(true, Palindrome.isPalindrome("Qweewq"));

    }

    @Test
    void isPalindromeNull() {
        assertEquals(false, Palindrome.isPalindrome(""));

    }

    void isPalindromeNullNull() {
        assertEquals(false, Palindrome.isPalindrome("232123"));

    }








}