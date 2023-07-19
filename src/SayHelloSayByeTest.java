import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SayHelloSayByeTest {
    private SayHelloSayBye sayHelloSayBye;

    @BeforeEach
    private void setUp() {
        sayHelloSayBye = new SayHelloSayBye();
    }


    @Test
    void nothing() {
    }

    @Test
    public void givenEmpty_returnEmpty() {
        String returnEmpty = sayHelloSayBye.sayHelloSayBye(null, -1);
        assertEquals("", returnEmpty);
    }

    @Test
    public void givenNull_returnEmpty() {
        String returnEmpty = sayHelloSayBye.sayHelloSayBye("", 5);
        assertEquals("", returnEmpty);
    }

    @Test
    public void givenName_returnHelloName() {
        String returnEmpty = sayHelloSayBye.sayHelloSayBye("Pullaiah", 1);
        assertEquals("Hello Pullaiah", returnEmpty);
    }

    @Test
    public void givenName_returnHelloNameSubhan() {
        String returnEmpty = sayHelloSayBye.sayHelloSayBye("Subhan", 1);
        assertEquals("Hello Subhan", returnEmpty);
    }

    @Test
    public void givenName_returnHelloNameRaghu() {
        String returnEmpty = sayHelloSayBye.sayHelloSayBye("Raghu", 5);
        assertEquals("Bye Raghu", returnEmpty);
    }
}