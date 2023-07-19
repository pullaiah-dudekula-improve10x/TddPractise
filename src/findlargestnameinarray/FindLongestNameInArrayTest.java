package findlargestnameinarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLongestNameInArrayTest {
    private FindLongestNameInArray longestNameInArray;

    @BeforeEach
    private void setUp() {
        longestNameInArray = new FindLongestNameInArray();
    }

    @Test
    void nothing() {
    }

    @Test
    public void givenEmpty_returnEmpty() {
        String returnEmpty = longestNameInArray.findLongestNameInArray(new String[] {""});
        assertEquals("", returnEmpty);
    }

    @Test
    public void givenNull_returnEmpty() {
        String returnEmpty = longestNameInArray.findLongestNameInArray(new String[] {""});
        assertEquals("", returnEmpty);
    }

    @Test
    public void givenNames_returnLongestName() {
        String returnViswanatah = longestNameInArray.findLongestNameInArray(new String[] {"renuka", "viswanath"});
        assertEquals("viswanath", returnViswanatah);
    }

    @Test
    public void givenSmallNames_returnLongestName() {
        String returnDef = longestNameInArray.findLongestNameInArray(new String[] {"a", "bc", "def"});
        assertEquals("def", returnDef);
    }

    @Test
    public void givenSumNames_returnLongestName() {
        String returnSriraghuSir = longestNameInArray.findLongestNameInArray(new String[] {"pullaiah", "vinod", "roopa", "manoj", "sriraghuSir"});
        assertEquals("sriraghuSir", returnSriraghuSir);
    }

    @Test
    public void givenSumNamesInArray_returnLongestName() {
        String returnMaruthi1234 = longestNameInArray.findLongestNameInArray(new String[] {"Innova", "honda", "Maruthi1234", "belano", "Innova", "honda", "Maruthi", "belano"});
        assertEquals("Maruthi1234", returnMaruthi1234);
    }

    @Test
    public void givenFiveNamesInArray_returnLongestName() {
        String returnGeeksForGreeks = longestNameInArray.findLongestNameInArray(new String[] {"Geek", "Geeks", "Geeksfor","GeeksforGeek", "GeeksforGreeks"});
        assertEquals("GeeksforGreeks", returnGeeksForGreeks);
    }
}