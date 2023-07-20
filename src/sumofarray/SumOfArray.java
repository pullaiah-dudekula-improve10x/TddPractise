package sumofarray;

public class SumOfArray {

    public int sumOfArray(int [] numbers) {
        if (numbers == null || numbers.length <= 0) {
            return 0;
        } else {
            int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result = result + numbers[i];
            }
            return result;
        }
    }
}

