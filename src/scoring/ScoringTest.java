package scoring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ScoringTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnAllZeros() {
        Scoring scoring = new Scoring();
        int[] allZeros = scoring.calculateScores(null);
        assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenA_returnOneZeroZero () {
        Scoring scoring = new Scoring();
        int[] onlyAScores = scoring.calculateScores("A");
        assertArrayEquals(new int[] {1, 0, 0},  onlyAScores);
    }

    @Test
    public void givenB_returnZerOneZero () {
        Scoring scoring = new Scoring();
        int[] onlyBScores = scoring.calculateScores("B");
        assertArrayEquals(new int[] {0, 1, 0}, onlyBScores);
    }

    @Test
    public void givenAB_returnOneOneZero () {
        Scoring scoring = new Scoring();
        int[] onlyABScores = scoring.calculateScores("AB");
        assertArrayEquals(new int[] {1, 1, 0}, onlyABScores);
    }

    @Test
    public void givenABC_returnOneOneOne () {
        Scoring scoring = new Scoring();
        int[] ABCScores = scoring.calculateScores("ABC");
        assertArrayEquals(new int[] {1, 1, 1}, ABCScores);
    }

    @Test
    public void givenAABC_returnOneOneOne () {
        Scoring scoring = new Scoring();
        int[] AABCScores = scoring.calculateScores("AABC");
        assertArrayEquals(new int[] {2, 1, 1}, AABCScores);
    }

    @Test
    public void givenAABBC_returnOneOneOne () {
        Scoring scoring = new Scoring();
        int[] onlyAABBCScores = scoring.calculateScores("AABBC");
        assertArrayEquals(new int[] {2, 2, 1}, onlyAABBCScores);
    }

    @Test
    public void givenAABBCCCCCC_returnOneOneOne () {
        Scoring scoring = new Scoring();
        int[] onlyAABBCCCCCCScores = scoring.calculateScores("AABBCCCCCC");
        assertArrayEquals(new int[] {2, 2, 6}, onlyAABBCCCCCCScores);
    }
}
