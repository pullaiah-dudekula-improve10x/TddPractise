package finddiscount;

import finddiscount.FindDiscount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDiscountTest {

    @Test
    void nothing() {
    }

    @Test
    public void givenZer_returnZero() {
        FindDiscount findDiscount = new FindDiscount();
        double returnZer0 = findDiscount.findDiscount(0, 0);
        assertEquals(-1, returnZer0);
    }


    @Test
    public void given500_return250() {
        FindDiscount findDiscount = new FindDiscount();
        double returnZero = findDiscount.findDiscount(500, 50);
        assertEquals(250, returnZero);
    }

    @Test
    public void given1000_return900() {
        FindDiscount findDiscount = new FindDiscount();
        double returnZer0 = findDiscount.findDiscount(1000, 10);
        assertEquals(900, returnZer0);
    }
}