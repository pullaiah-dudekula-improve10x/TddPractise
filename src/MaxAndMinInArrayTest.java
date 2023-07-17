import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAndMinInArrayTest {

    private MaxAndMinInArray maxAndMinInArray;

    @BeforeEach
    public void setUp() {
        maxAndMinInArray = new MaxAndMinInArray();
    }

    @Test
    void nothing() {
    }

    @Test
    public void givenNull_returnNull() {
        int returnZero = maxAndMinInArray.maxAndMinInArray(new int[] {});
        assertEquals(0, returnZero);
    }

    @Test
    public void givenOneNegative_returnOneNegative() {
        int returnNegative = maxAndMinInArray.maxAndMinInArray(new int[] {-1});
        assertEquals(0, returnNegative);
    }

    @Test
    public void findMaxAndMinDifference() {
        int returnNegative = maxAndMinInArray.maxAndMinInArray(new int[] {15, 25, 1, 35, 100});
        assertEquals(99, returnNegative);
    }

    @Test
    public void findMaxAndMinDifferenceTest() {
        int returnNegative = maxAndMinInArray.maxAndMinInArray(new int[] {10, -1, -2, -3, -5});
        assertEquals(15, returnNegative);
    }
}
