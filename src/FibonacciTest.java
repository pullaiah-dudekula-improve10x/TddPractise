import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void nothing() {

    }

    @Test
    public void returnNegative_giveNegative() {
        Fibonacci fibonacci = new Fibonacci();
        int negative = fibonacci.find(-10);
        assertEquals(-1, negative);
    }

    @Test
    public void givenZero_returnZero() {
        Fibonacci fibonacci = new Fibonacci();
        int givenZero = fibonacci.find(0);
        assertEquals(0, givenZero);
    }

    @Test
    public void givenOne_returnOne() {
        Fibonacci fibonacci = new Fibonacci();
        int givenOne = fibonacci.find(1);
        assertEquals(1, givenOne);
    }

    @Test
    public void givenTwo_returnTwo() {
        Fibonacci fibonacci = new Fibonacci();
        int givenTwo = fibonacci.find(2);
        assertEquals(1, givenTwo);
    }

    @Test
    public void givenFive_returnFive() {
        Fibonacci fibonacci = new Fibonacci();
        int givenFive = fibonacci.find(5);
        assertEquals(5, givenFive);
    }
    @Test
    public void givenTen_returnFive() {
        Fibonacci fibonacci = new Fibonacci();
        int givenFive = fibonacci.find(10);
        assertEquals(55, givenFive);
    }
}