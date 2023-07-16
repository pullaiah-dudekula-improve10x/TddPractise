package bowlingGame;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    private BowlingGame bowlingGame;

    @BeforeEach
    private void setUp() {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void canRoll() {
        bowlingGame.role(1);
    }

    @Test
    public void gutterName() {
        for(int i = 0; i < 20; i++) {
            bowlingGame.role(0);
        }
        Assert.assertEquals(0, bowlingGame.Score());
    }


}
