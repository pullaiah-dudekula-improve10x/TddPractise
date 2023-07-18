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
    public void givenNull_returnEmpty() {
        String returnEmpty = findBomb.findBomb("");
        assertEquals("", returnEmpty);
    }

    @Test
    public void givenBomb_returnDuck() {
        String returnDuck = findBomb.findBomb("Thefts are keeped bomb in shopping mall");
        assertEquals("Duck!", returnDuck);
    }

    @Test
    public void givenBombInShoppingMall_returnDuck() {
        String returnDuck = findBomb.findBomb("In my home having bomb");
        assertEquals("Duck!", returnDuck);
    }

    @Test
    public void givenDuck_returnRelaxThereIsNoBomb() {
        String returnRelaxThereIsNoBomb = findBomb.findBomb("Duck");
        assertEquals("Relax there is no Bomb!", returnRelaxThereIsNoBomb);
    }

    @Test
    public void givenThereIsBomb_returnDuck() {
        String returnDuck = findBomb.findBomb("There is Bomb");
        assertEquals("Duck!", returnDuck);
    }

    @Test
    public void givenRelax_returnRelaxThereIsNoBomb() {
        String  returnRelaxThereIsNoBomb = findBomb.findBomb("relax");
        assertEquals("Relax there is no Bomb!", returnRelaxThereIsNoBomb);
    }
}