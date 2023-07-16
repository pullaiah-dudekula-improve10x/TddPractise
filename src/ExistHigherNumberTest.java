import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExistHigherNumberTest {

    @Test
    void nothing() {
    }

    @Test
    public void givenArrayIsEmpty_returnNegative() {
        ExistHigherNumber higherNumber = new ExistHigherNumber();
        boolean returnMinusOne = higherNumber.existHigherNumber(new int[] {}, -1);
        assertEquals(false, returnMinusOne);
    }

    @Test
    public void existHigherNumber() {
        ExistHigherNumber higherNumber = new ExistHigherNumber();
        boolean returnFalse = higherNumber.existHigherNumber(new int[] {25, 10, 12}, 26);
        assertEquals(false, returnFalse);
    }

    @Test
    public void existHigherNumberTest() {
        ExistHigherNumber higherNumber = new ExistHigherNumber();
        boolean returnTrue = higherNumber.existHigherNumber(new int[] {0, 0, 1}, 1);
        assertEquals(true, returnTrue);
    }
}