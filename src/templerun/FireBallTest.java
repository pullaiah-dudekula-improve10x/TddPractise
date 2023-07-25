package templerun;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FireBallTest {
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    private void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

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

    @Test
    public void given20_whenRollMethodCalled_displayRollingMessage() {
        FireBall fireBall = new FireBall(10);
        fireBall.roll();
        assertEquals("FireBall is rolled with " + 10 + " kmh speed!", outputStream.toString().trim());

    }
    @Test
    public void given99_whenRollMethodCalled_displayRollingMessage() {
        FireBall fireBall = new FireBall(99);
        fireBall.roll();
        assertEquals("FireBall is rolled with " + 99 + " kmh speed!", outputStream.toString().trim());
    }
}


