import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NThEvenNumberTest {
    private NThEvenNumber nThEvenNumber;

    @BeforeEach
    private void setUp() {
        nThEvenNumber = new NThEvenNumber();
    }


    @Test
    void nothing() {
    }

    @Test
    public void givenZero_returnZero() {
       int returnZero =  nThEvenNumber.findNThEvenNumber(0);
       assertEquals(0, returnZero);
    }

    @Test
    public void givenNegative_returnMinusOne() {
        int returnZero =  nThEvenNumber.findNThEvenNumber(-10);
        assertEquals(-1, returnZero);
    }

    @Test
    public void givenTen_returnEighteen() {
        int returnZero =  nThEvenNumber.findNThEvenNumber(10);
        assertEquals(18, returnZero);
    }

    @Test
    public void givenHundred_returnOneEightyEight() {
        int returnZero =  nThEvenNumber.findNThEvenNumber(100);
        assertEquals(198, returnZero);
    }

    @Test
    public void givenTwentyFive_returnFortyEight() {
        int returnZero =  nThEvenNumber.findNThEvenNumber(25);
        assertEquals(48, returnZero);
    }
}