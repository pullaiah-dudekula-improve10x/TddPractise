package hurdlejump;

public class HurdleJump {

    public boolean hurdleJump(int[] hurdleHeight, int hurdleJump) {
        if (hurdleHeight == null || hurdleHeight.length <= 0) {
            return false;
        } else {
            boolean result = false;
            int max = hurdleHeight[0];
            for (int i = 1; i < hurdleHeight.length; i++) {
                if (hurdleHeight[i] > max) {
                    max = hurdleHeight[i];
                }
                if (hurdleJump >= max) {
                    result = true;
                }
            }
            return result;
        }
    }
}

