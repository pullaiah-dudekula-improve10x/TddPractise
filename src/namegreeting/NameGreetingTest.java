package namegreeting;

import namegreeting.NameGreeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameGreetingTest {
    private NameGreeting nameGreeting;

    @BeforeEach
    private void setUp() {
        nameGreeting = new NameGreeting();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmpty_returnEmpty() {
        String returnEmpty = nameGreeting.nameGreeting("");
        assertEquals("", returnEmpty);
    }

    @Test
    public void givenName_returnHelloText() {
        String returnName = nameGreeting.nameGreeting("Pullaiah");
        assertEquals("Hello Pullaiah!", returnName);
    }

    @Test
    public void givenSubhan_returnHelloName() {
        String returnSubhan = nameGreeting.nameGreeting("Subhan");
        assertEquals("Hello Subhan!", returnSubhan);
    }

    @Test
    public void givenShahid_returnHelloName() {
        String returnShahid = nameGreeting.nameGreeting("Shahid");
        assertEquals("Hello Shahid!", returnShahid);
    }
}