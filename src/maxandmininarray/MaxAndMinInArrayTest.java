package maxandmininarray;

import maxandmininarray.MaxAndMinInArray;
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
    public void givenOneNegative_returnZero() {
        int returnZero = maxAndMinInArray.maxAndMinInArray(new int[] {-1});
        assertEquals(0, returnZero);
    }

    @Test
    public void findMaxAndMinDifference() {
        int returnNinetyNine = maxAndMinInArray.maxAndMinInArray(new int[] {15, 25, 1, 35, 100});
        assertEquals(99, returnNinetyNine);
    }

    @Test
    public void findMaxAndMinDifferenceTest() {
        int returnFifteen = maxAndMinInArray.maxAndMinInArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(7, returnFifteen);
    }

    @Test
    public void findMaxAndMinDifferenceInArray() {
        int returnFifteen = maxAndMinInArray.maxAndMinInArray(new int[] {11, 22, 33, 44, 55, 66, 77, 88});
        assertEquals(77, returnFifteen);
    }

    @Test
    public void givenValuesInArray_findMaxAndMinDifferenceInArray() {
        int returnFifteen = maxAndMinInArray.maxAndMinInArray(new int[] {99, 125, 255});
        assertEquals(156, returnFifteen);
    }


}
