package nameinverter;

import nameinverter.NameInverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameInverterTest {
    private NameInverter nameInverter;

    @BeforeEach
    private void setUp() {
        nameInverter = new NameInverter();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenEmpty_returnEmpty() {
        String givenEmpty = nameInverter.nameInverter("");
        assertEquals("", givenEmpty);
    }

    @Test
    public void givenSingleWord_returnSingleWord() {
        String givenEmpty = nameInverter.nameInverter("Pullaiah");
        assertEquals(givenEmpty, givenEmpty);
    }

    @Test
    public void givenSingleWordWithTrailingSpaces_returnSingleWord() {
        String givenEmpty = nameInverter.nameInverter("Pullaiah   ");
        assertEquals(givenEmpty, givenEmpty);
    }

    @Test
    public void givenSingleWordWithBeginningSpaces_returnSingleWord() {
        String givenEmpty = nameInverter.nameInverter("   Pullaiah   ");
        assertEquals(givenEmpty, givenEmpty);
    }

    @Test
    public void givenFirstLast_returnLastFirst() {
        String lastFirst = nameInverter.nameInverter("first last");
        assertEquals("last, first", lastFirst);
    }

    @Test
    public void givenHonorifics_returnHonorifics() {
        String invertedName = nameInverter.nameInverter("Mrs. first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenPostNominals_stayAtEnd() {
        String invertedName =  nameInverter.nameInverter("first last MSc.");
        assertEquals("last, first MSc.", invertedName);
    }
}