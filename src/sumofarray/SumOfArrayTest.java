package sumofarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfArrayTest {
    private SumOfArray sumOfArray;

    @BeforeEach
    private void setUp() {
        sumOfArray = new SumOfArray();
    }

    @Test
    void nothing() {
    }

    @Test
    public void givenNull_returnZero() {
        int returnZero = sumOfArray.sumOfArray(new int[] {});
        assertEquals(0, returnZero);
    }

    @Test
    public void givenEmpty_returnZero() {
        int returnZero = sumOfArray.sumOfArray(null);
        assertEquals(0, returnZero);
    }

    @Test
    public void givenArray_returnValue() {
        int returnOne = sumOfArray.sumOfArray(new int[] {0, 0, 1});
        assertEquals(1, returnOne);
    }

    @Test
    public void givenArray_returnThree() {
        int returnThree = sumOfArray.sumOfArray(new int[] {1, 1, 1});
        assertEquals(3, returnThree);
    }

    @Test
    public void givenArray_returnSix() {
        int returnSix = sumOfArray.sumOfArray(new int[] {3, 2, 1});
        assertEquals(6, returnSix);
    }

    @Test
    public void givenArray_returnFourty() {
        int returnFourty = sumOfArray.sumOfArray(new int[] {10, 20, 10});
        assertEquals(40, returnFourty);
    }

    @Test
    public void givenArray_returnTwoTwenty() {
        int twoTwenty = sumOfArray.sumOfArray(new int[] {55, 25, 15, 55, 70});
        assertEquals(220, twoTwenty);
    }
}