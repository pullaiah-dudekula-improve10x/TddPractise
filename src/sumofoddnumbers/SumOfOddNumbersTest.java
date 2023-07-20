package sumofoddnumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfOddNumbersTest {
    private SumOfOddNumbers sumOfOddNumbers;

    @BeforeEach
    private void setUp() {
        sumOfOddNumbers = new SumOfOddNumbers();
    }

    @Test
    void nothing() {
    }

    @Test
    public void givenNull_returnZero() {
        int returnZero = sumOfOddNumbers.sumOfOddNumbers(null);
        assertEquals(0, returnZero);
    }

    @Test
    public void givenEmpty_returnZero() {
        int returnZero = sumOfOddNumbers.sumOfOddNumbers(new int[] {});
        assertEquals(0, returnZero);
    }

    @Test
    public void givenZero_returnZero() {
        int returnZero = sumOfOddNumbers.sumOfOddNumbers(new int[] {0});
        assertEquals(0, returnZero);
    }

    @Test
    public void givenArray_returnSum() {
        int returnTwo = sumOfOddNumbers.sumOfOddNumbers(new int[] {0, 1, 1});
        assertEquals(2, returnTwo);
    }

    @Test
    public void givenArray_returnFour() {
        int returnFour = sumOfOddNumbers.sumOfOddNumbers(new int[] {1, 2, 3});
        assertEquals(4, returnFour);
    }

    @Test
    public void givenArray_returnEighteen() {
        int returnEighteen = sumOfOddNumbers.sumOfOddNumbers(new int[] {9, 2, 4, 6, 9});
        assertEquals(18, returnEighteen);
    }

    @Test
    public void givenInArray_returnOne() {
        int returnOne = sumOfOddNumbers.sumOfOddNumbers(new int[] {2, 4, 6, 8, 1});
        assertEquals(1, returnOne);
    }

    @Test
    public void givenArray_returnOne() {
        int returnEighteen = sumOfOddNumbers.sumOfOddNumbers(new int[] {2, 4, 6, 8, 1});
        assertEquals(1, returnEighteen);
    }

    @Test
    public void givenArray_returnOne11() {
        int returnOneOneFive = sumOfOddNumbers.sumOfOddNumbers(new int[] {21, 34, 60, 81, 13});
        assertEquals(115, returnOneOneFive);
    }

}