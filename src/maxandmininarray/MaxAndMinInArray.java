package maxandmininarray;

public class MaxAndMinInArray {

    public int maxAndMinInArray(int [] array) {
        if (array == null || array.length <= 0) {
            return 0;
        } else {
            int difference = 0;
            int maxValue = array[0];
            int minValue = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
                if (array[i] < minValue) {
                    minValue = array[i];
                }
                difference = maxValue - minValue;
            }
            return difference;
        }
    }
}



