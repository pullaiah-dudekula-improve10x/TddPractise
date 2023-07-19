package existhighernumber;

import existhighernumber.ExistHigherNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExistHigherNumberTest {

    @Test
    void nothing() {
    }

    @Test
    public void givenArrayIsEmpty_returnNegative() {
        ExistHigherNumber higherNumber = new ExistHigherNumber();
        boolean returnMinusOne = higherNumber.existHigherNumber(null, 0);
        assertEquals(false, returnMinusOne);
    }

    @Test
    public void existHigherNumber() {
        ExistHigherNumber higherNumber = new ExistHigherNumber();
        boolean returnFalse = higherNumber.existHigherNumber(new int[] {1 ,2, 3, 4, 5, 6}, 4);
        assertEquals(true, returnFalse);
    }

    @Test
    public void existHigherNumberTest() {
        ExistHigherNumber higherNumber = new ExistHigherNumber();
        boolean returnTrue = higherNumber.existHigherNumber(new int[] {0, 0, 1}, 1);
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenValuesInArray_existHigherNumberTest() {
        ExistHigherNumber higherNumber = new ExistHigherNumber();
        boolean returnTrue = higherNumber.existHigherNumber(new int[] {0, 5, 6 , 8}, 10);
        assertEquals(false, returnTrue);
    }
}