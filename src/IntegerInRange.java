public class IntegerInRange {

    public boolean integerInRange(int n, int a, int b) {
        if (a <= 0 && b <= 0) {
            return false;
        } else if (n >= a && n < b) {
            return true;
        } else {
            return false;
        }
    }
}
