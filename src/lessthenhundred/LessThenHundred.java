package lessthenhundred;

public class LessThenHundred {

    public boolean lessThenHundred(int a, int b) {
        if (a <= 0 && b <= 0 ) {
            return false;
        } else {
            boolean result = false;
            int sum = a + b;
            int n = 100;
            if (sum < n) {
                result = true;
            }
            return result;
        }
    }
}
