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
}