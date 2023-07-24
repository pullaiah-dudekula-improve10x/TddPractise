package templerun;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test

    public void nothing() {

    }

    @Test
    public void givenNameNull_whenGetNameCalled_thenReturnEmpty() {
        Player player = new Player(null);
        Assert.assertEquals("", player.getName());
    }

    @Test
    public void givenNameEmpty_whenGetNameCalled_returnEmpty() {
        Player player = new Player("");
        Assert.assertEquals("", player.getName());
    }

    @Test
    public void givenNameExplorer_whenGetNameCalledReturnExplorer() {

    }

}
