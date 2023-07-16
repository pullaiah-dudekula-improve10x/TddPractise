package findtotallegs;

import findtotallegs.FindTotalLegs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTotalLegsTest {

    @Test
    public void nothing() {

    }
    @Test
   public void findChickenLegs() {
        FindTotalLegs findTotalLegs = new FindTotalLegs();
        int givenZero_returnZero = findTotalLegs.findChickenLegs(2, 0, 0);
        assertEquals(4, givenZero_returnZero);
    }

    @Test
    public void findChicken_cowLegs() {
        FindTotalLegs findTotalLegs = new FindTotalLegs();
        int findChicken_cowLegs = findTotalLegs.findChickenLegs(4, 5, 0);
        assertEquals(28, findChicken_cowLegs);
    }

    @Test
    public void findChicken_cowLegs_oxLegs() {
        FindTotalLegs findTotalLegs = new FindTotalLegs();
        int findChicken_cowLegs_oxLegs = findTotalLegs.findChickenLegs(4, 5, 1);
        assertEquals(32, findChicken_cowLegs_oxLegs);
    }

    @Test
    public void findTotalLegs() {
        FindTotalLegs findDiscount = new FindTotalLegs();
        int findTotalLegs = findDiscount.findChickenLegs(1, 1, 1);
        assertEquals(10, findTotalLegs);

    }
}