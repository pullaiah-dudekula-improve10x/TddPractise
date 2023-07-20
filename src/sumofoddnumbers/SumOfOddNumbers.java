package sumofoddnumbers;

public class SumOfOddNumbers {

    public int sumOfOddNumbers(int [] numbers) {
        if(numbers == null || numbers.length <= 0) {
            return 0;
        } else {
            int oddNumbers = 0;
            for(int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    oddNumbers = oddNumbers + numbers[i];
                }
            }
            return oddNumbers;
        }
    }
}
