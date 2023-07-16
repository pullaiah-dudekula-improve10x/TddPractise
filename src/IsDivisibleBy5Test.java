import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsDivisibleBy5Test {

    @Test
    public void nothing() {

    }


    @Test
    public void givenZero_returnFalse () {
        IsDivisibleBy5 isDivisibleBy5 = new IsDivisibleBy5();
        boolean givenZeo_returnFalse = isDivisibleBy5.isDivisibleBy5(0);
        assertEquals(false, givenZeo_returnFalse);
    }

    @Test
    public void givenNegative_returnFalse () {
        IsDivisibleBy5 isDivisibleBy5 = new IsDivisibleBy5();
        boolean givenNegative_returnFalse = isDivisibleBy5.isDivisibleBy5(-1);
        assertEquals(false, givenNegative_returnFalse);
    }


    @Test
    public void isDivisibleByFive() {
        IsDivisibleBy5 isDivisibleBy5 = new IsDivisibleBy5();
        boolean isDivisibleByFive = isDivisibleBy5.isDivisibleBy5(10);
        assertEquals(true, isDivisibleByFive);
    }

    @Test
    public void isDivisibleByFiveTest() {
        IsDivisibleBy5 isDivisibleBy5 = new IsDivisibleBy5();
        boolean isDivisibleByFiveTest = isDivisibleBy5.isDivisibleBy5(8);
        assertEquals(false, isDivisibleByFiveTest);
    }
}