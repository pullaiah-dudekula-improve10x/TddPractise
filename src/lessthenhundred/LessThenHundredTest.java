package lessthenhundred;

import lessthenhundred.LessThenHundred;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LessThenHundredTest {
    private LessThenHundred lessThenHundred;

    @BeforeEach
    private void setUp() {
        lessThenHundred = new LessThenHundred();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenABZeros_returnFalse() {
        boolean returnFalse = lessThenHundred.lessThenHundred(0, 0);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenABNegatives_returnFalse() {
        boolean returnFalse = lessThenHundred.lessThenHundred(-1, -2);
        assertEquals(false, returnFalse);
    }


    @Test
    public void givenTwentyTwo_fifteen_isLessThenHundred () {
        boolean returnTrue = lessThenHundred.lessThenHundred(115, 25);
        assertEquals(false, returnTrue);
    }

    @Test
    public void givenEightyThree_thirtyFour_isLessThenHundred () {
        boolean returnFalse = lessThenHundred.lessThenHundred(83, 34);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenFifteen_thirty () {
        boolean returnFalse = lessThenHundred.lessThenHundred(15, 30);
        assertEquals(true, returnFalse);
    }

    @Test
    public void three_seventySeven_isLessThenHundred () {
        boolean returnTrue = lessThenHundred.lessThenHundred(99, 1);
        assertEquals(false, returnTrue);
    }
}
