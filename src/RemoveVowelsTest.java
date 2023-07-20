import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveVowelsTest {
    private RemoveVowels removeVowels;

    @BeforeEach
    private void setUp() {
        removeVowels = new RemoveVowels();
    }

    @Test
    void nothing() {
    }

    @Test
    public void givenEmptyText_returnEmpty() {
        String returnEmpty = removeVowels.removeVowels("");
        assertEquals("", returnEmpty);
    }

    @Test
    public void givenNull_returnEmpty() {
        String returnEmpty = removeVowels.removeVowels(null);
        assertEquals("", returnEmpty);
    }

    @Test
    public void givenText_returnEmpty() {
        String returnA = removeVowels.removeVowels("a");
        assertEquals("", returnA);
    }

    @Test
    public void givenText_returnBC() {
        String returnBC = removeVowels.removeVowels("abc");
        assertEquals("bc", returnBC);
    }

    @Test
    public void givenText_returnPpl() {
        String returnBC = removeVowels.removeVowels("Apple");
        assertEquals("ppl", returnBC);
    }

    @Test
    public void givenText_returnRrrB() {
        String returnRrrB = removeVowels.removeVowels("Error Ab");
        assertEquals("rrr b", returnRrrB);
    }

    @Test
    public void givenText_returnCorrectText() {
        String returnCorrectText = removeVowels.removeVowels("apple bat duck bowl");
        assertEquals("ppl bt dck bwl", returnCorrectText);
    }
}