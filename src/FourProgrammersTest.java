import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourProgrammersTest {
    private FourProgrammers fourProgrammers;


    @BeforeEach
    private void setUp() {
        fourProgrammers = new FourProgrammers();
    }

    @Test
    void nothing() {
    }

    @Test
    public void givenAllZeros_returnMinusOne() {
        int returnZero = fourProgrammers.fourProgrammers(0, 0, 0, 0);
        assertEquals(-1, returnZero);
    }


    @Test
    public void givenAllNegatives_returnMinusOne() {
        int returnZero = fourProgrammers.fourProgrammers(-0, -5, -3, -8);
        assertEquals(-1, returnZero);
    }

    @Test
    public void givenFourValues_returnSeventyFive() {
        int returnMaxPaid = fourProgrammers.fourProgrammers(100, 25, 27, 28);
        assertEquals(75, returnMaxPaid);
    }


    @Test
    public void givenFourValues_returnThree() {
        int returnMinPaid = fourProgrammers.fourProgrammers(25, 26, 27, 28);
        assertEquals(3, returnMinPaid);
    }

    @Test
    public void givenFourValues_returnOneTwentyFour() {
        int returnMinPaid = fourProgrammers.fourProgrammers(100, 110, 125, 1);
        assertEquals(124, returnMinPaid);
    }
}