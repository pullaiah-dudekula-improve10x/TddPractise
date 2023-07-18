package nthevennumber;

public class NThEvenNumber {

    public int findNThEvenNumber(int num) {
        if (num == 0) {
            return 0;
        } else if (num < 0) {
            return -1;
        } else {
            return 2 * num - 2;
        }
    }
}
