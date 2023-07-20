package countvowels;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsTest {
    private CountVowels countVowels;

    @BeforeEach
    private void setUp() {
        countVowels = new CountVowels();
    }


    @Test
    void nothing() {
    }

    @Test
    public void givenNull_returnEmpty() {
        int count = countVowels.countVowels(null);
        assertEquals(0, count);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        int count = countVowels.countVowels("");
        assertEquals(0, count);
    }

    @Test
    public void givenOneLetter_returnValue() {
        int returnOne = countVowels.countVowels("a");
        assertEquals(1, returnOne);
    }

    @Test
    public void givenTwoLettersInText_returnValue() {
        int returnTwo = countVowels.countVowels("ae");
        assertEquals(2, returnTwo);
    }

    @Test
    public void givenThreeLettersInText_returnValue() {
        int returnTwo = countVowels.countVowels("aeI");
        assertEquals(3, returnTwo);
    }

    @Test
    public void givenText_returnValue() {
        int returnTwo = countVowels.countVowels("elephant");
        assertEquals(3, returnTwo);
    }

    @Test
    public void givenText_returnValueInInt() {
        int returnTwo = countVowels.countVowels("i love india");
        assertEquals(6, returnTwo);
    }

    @Test
    public void givenText_returnValueInCount() {
        int returnTwo = countVowels.countVowels("i love india and my village");
        assertEquals(10, returnTwo);
    }
}