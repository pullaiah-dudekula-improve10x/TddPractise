package reversestring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reversestring.ReverseString;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    private ReverseString reverseString;

    @BeforeEach
    private void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    public void nothing () {

    }

    @Test
    public void givenEmpty_returnEmpty() {
        String givenEmpty = reverseString.reverseString("");
        assertEquals("", givenEmpty);
    }

    @Test
    public void givenTwoLetters_reverseTwoLetters() {
        String givenTwoLetters = reverseString.reverseString("PU");
        assertEquals("UP", givenTwoLetters);
    }

    @Test
    public void givenFourLetters_reverseFourLetters() {
        String reverseFourLetters = reverseString.reverseString("PULL");
        assertEquals("LLUP", reverseFourLetters);
    }

    @Test
    public void givenText_reverseText() {
        String reverseText = reverseString.reverseString("PULLAIAH");
        assertEquals("HAIALLUP", reverseText);
    }
}