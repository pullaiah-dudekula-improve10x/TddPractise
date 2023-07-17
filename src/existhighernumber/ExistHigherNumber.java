package existhighernumber;

public class ExistHigherNumber {

    public boolean existHigherNumber(int [] arr, int num) {
        if (arr == null || arr.length <= 0) {
            return false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= num) {
                    return true;
                }
            }
        }
        return false;
    }
}

