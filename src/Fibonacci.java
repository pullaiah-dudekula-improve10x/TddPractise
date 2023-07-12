public class Fibonacci {

    public int find(int i) {
        if (i < 0) {
            return  -1;
        } else if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return find(i - 1) + find(i - 2);
        }
    }
}
