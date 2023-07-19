import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveTheLettersABCInTextTest {
    private RemoveTheLettersABCInText lettersABCInText;

    @BeforeEach
    private void setUp() {
        lettersABCInText = new RemoveTheLettersABCInText();
    }

    @Test
    void nothing() {
    }

    @Test
    public void givenEmptyText_returnEmptyText() {
        String returnEmpty = lettersABCInText.removeTheLettersABCInText("");
        assertEquals("", returnEmpty);
    }

    @Test
    public void givenNull_returnEmpty() {
        String returnEmpty = lettersABCInText.removeTheLettersABCInText(null);
        assertEquals("", returnEmpty);
    }

    @Test
    public void givenText_returnEmpty() {
        String returnEmpty = lettersABCInText.removeTheLettersABCInText("A");
        assertEquals(" ", returnEmpty);
    }

    @Test
    public void givenText_returnEmpty1() {
        String returnEmpty = lettersABCInText.removeTheLettersABCInText("Apple contain");
        assertEquals(" pple ontin", returnEmpty);
    }

}