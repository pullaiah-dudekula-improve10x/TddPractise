package votecount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import votecount.VoteCount;

import static org.junit.jupiter.api.Assertions.*;

class VoteCountTest {
    private VoteCount voteCount;

    @BeforeEach
    private void setUp() {
        voteCount = new VoteCount();
    }

    @Test
    void nothing() {
    }

    @Test
    public void givenZeros_returnZero() {
        int returnZero = voteCount.voteCount(0, 0);
        assertEquals(0, returnZero);
    }

    @Test
    public void givenNegative_returnMinusOne() {
        int returnMinusOne = voteCount.voteCount(-9, -10);
        assertEquals(-1, returnMinusOne);
    }

    @Test
    public void givenValues_returnVoteCount() {
        int returnFifteen = voteCount.voteCount(25, 10);
        assertEquals(15, returnFifteen);
    }

    @Test
    public void given2Values_returnVoteCount() {
        int returnNineteyNine = voteCount.voteCount(100, 1);
        assertEquals(99, returnNineteyNine);
    }
    @Test
    public void givenValuesTest_returnVoteCount() {
        int returnZero = voteCount.voteCount(100, 100);
        assertEquals(0, returnZero);
    }
}
