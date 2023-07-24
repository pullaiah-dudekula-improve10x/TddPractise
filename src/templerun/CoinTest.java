package templerun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CoinTest {


    @Test
    public void givenMinusOne_throwsInvalidCoinValueException() {
        assertThrows(Coin.InvalidCoinValueException.class, () -> new Coin(-1),
                "Coin value should be between 0 to 100");
    }

    @Test
    public void given101_throwsInvalidCoinValueException() {
        assertThrows(Coin.InvalidCoinValueException.class, () -> new Coin(101), "Coin value should be between 0 to 100");
    }

    @Test
    public void given10_whenGetValueCalled_thenReturn10() {
        assertEquals(20, new Coin(20).getValue());
    }
}
