package integerinrange;

import integerinrange.IntegerInRange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerInRangeTest {
    private IntegerInRange integerInRange;

    @BeforeEach
    private void setUp() {
        integerInRange = new IntegerInRange();
    }

    @Test
    void nothing() {
    }

    @Test
    public void givenABZeros_returnFalse() {
        boolean  returnFalse = integerInRange.integerInRange(0, 0, 0);
        assertEquals(false, returnFalse);

    }

    @Test
    public void givenABNegative_returnFalse() {
        boolean returnFalse = integerInRange.integerInRange(0, -1, -8);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenABValues_returnTrue() {
        boolean returnFalse = integerInRange.integerInRange(12, 11, 15);
        assertEquals(true, returnFalse);
    }

    @Test
    public void givenABValues_returnFalse() {
        boolean returnFalse = integerInRange.integerInRange(10, 75, 90);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenValues_returnTrue() {
        boolean returnFalse = integerInRange.integerInRange(25, 20, 30);
        assertEquals(true, returnFalse);
    }
}