package findbomb;

import findbomb.FindBomb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindBombTest {
    private FindBomb findBomb;

    @BeforeEach
    private void setUp() {
        findBomb = new FindBomb();
    }


    @Test
    void nothing() {
    }

    @Test
    public void givenEmpty_returnEmpty() {
        String returnEmpty = findBomb.findBomb("");
        assertEquals("", returnEmpty);
    }

    @Test
    public void givenBomb_returnDuck() {
        String returnEmpty = findBomb.findBomb("bomb");
        assertEquals("Duck!", returnEmpty);
    }

    @Test
    public void givenDuck_returnRelaxThereIsNoBomb() {
        String returnEmpty = findBomb.findBomb("Duck");
        assertEquals("Relax there is no Bomb!", returnEmpty);
    }

    @Test
    public void givenThereIsBomb_returnDuck() {
        String returnEmpty = findBomb.findBomb("There is Bomb");
        assertEquals("Duck!", returnEmpty);
    }

    @Test
    public void givenRelax_returnRelaxThereIsNoBomb() {
        String returnEmpty = findBomb.findBomb("relax");
        assertEquals("Relax there is no Bomb!", returnEmpty);
    }
}