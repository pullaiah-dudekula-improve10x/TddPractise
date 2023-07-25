package templerun;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;


public class FireBallTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenMinusOne_throwFireBallInvalidException() {
        assertThrows(FireBall.InvalidFireBallSpeedException.class,
                () -> new FireBall(-1),
                "Fireball speed should be between 0 to 100");
    }
    @Test
    public void given101_throwsInvalidFireBallSpeedException() {
        assertThrows(FireBall.InvalidFireBallSpeedException.class,
                () -> new FireBall(101),
                "Fireball speed should be between 0 to 100");
    }
}


