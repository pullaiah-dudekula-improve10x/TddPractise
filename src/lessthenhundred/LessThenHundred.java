package lessthenhundred;

public class LessThenHundred {

    public boolean lessThenHundred(int a, int b) {
        boolean result = false;
        int sum = a + b;
        int n = 100;
        if (sum < n) {
            result = true;
        }
        return result;
    }
}
