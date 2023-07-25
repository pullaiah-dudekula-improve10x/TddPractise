package templerun;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ObstacleTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNameNull_whenGetNameCalled_thenReturnEmpty() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle(null, 20);
        assertEquals("", obstacle.getName());
    }

    @Test
    public void givenNameEmpty_whenGetNameCalled_thenReturnEmpty() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle("", 20);
        assertEquals("", obstacle.getName());
    }
}
