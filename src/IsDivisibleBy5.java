public class IsDivisibleBy5 {

    public boolean isDivisibleBy5(int num) {
        boolean result = false;
        if (num <= 0) {
            result = false;
        } else {
            if (num % 5 == 0) {
                result = true;
            }
        }
        return result;
    }
}

