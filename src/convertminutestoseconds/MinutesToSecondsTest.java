package convertminutestoseconds;

import convertminutestoseconds.MinutesToSeconds;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsTest {

    @Test
    public void  nothing() {
    }

    @Test
    public void givenZero_returnZero() {
        MinutesToSeconds minutesToSeconds = new MinutesToSeconds();
        int returnZero = minutesToSeconds.minutesToSeconds(0);
        assertEquals(0, returnZero);
    }

    @Test
    public void givenNegative_returnNegative() {
        MinutesToSeconds minutesToSeconds = new MinutesToSeconds();
        int returnNegative = minutesToSeconds.minutesToSeconds(-8);
        assertEquals(-1, returnNegative);
    }

    @Test
    public void givenMinutes_returnSeconds() {
        MinutesToSeconds minutesToSeconds = new MinutesToSeconds();
        int returnNegative = minutesToSeconds.minutesToSeconds(5);
        assertEquals(300, returnNegative);
    }
}