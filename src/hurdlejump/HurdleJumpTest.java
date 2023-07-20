package hurdlejump;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HurdleJumpTest {
    private HurdleJump hurdleJump;

    @BeforeEach
    private void setUp() {
        hurdleJump = new HurdleJump();
    }

    @Test
    void nothing() {
    }

    @Test
    public void givenNullInArray_returnFalse() {
       boolean returnFalse =  hurdleJump.hurdleJump(null, 0);
       assertEquals(false, returnFalse);
    }

    @Test
    public void givenEmptyInArray_returnFalse() {
        boolean returnFalse =  hurdleJump.hurdleJump(new int[] {}, 0);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenArray_returnTrue() {
        boolean returnFalse =  hurdleJump.hurdleJump(new int[] {1}, 0);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenInArray_returnTrue() {
        boolean returnFalse =  hurdleJump.hurdleJump(new int[] {1, 2, 3}, 3);
        assertEquals(true, returnFalse);
    }

    @Test
    public void givenInArray_returnFalse() {
        boolean returnFalse =  hurdleJump.hurdleJump(new int[] {9, 11, 8, 2, 4}, 1);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenArray_returnFalse() {
        boolean returnFalse =  hurdleJump.hurdleJump(new int[] {1, 2, 1}, 1);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenArrayValues_returnFalse() {
        boolean returnFalse =  hurdleJump.hurdleJump(new int[] {1, 2, 3, 6, 4}, 12);
        assertEquals(true, returnFalse);
    }

    @Test
    public void givenArrayValues_returnCorrectBoolean() {
        boolean returnFalse =  hurdleJump.hurdleJump(new int[] {100, 125, 11, 13, 14, 66, 88}, 11);
        assertEquals(false, returnFalse);
    }
}