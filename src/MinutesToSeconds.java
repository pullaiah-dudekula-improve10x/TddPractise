public class MinutesToSeconds {

    public int minutesToSeconds(int minutes) {
        int seconds = 0;
        if (minutesEqualsToZero(minutes)) {
            return 0;
        } else if (minutesLessThenZero(minutes)) {
            return  -1;
        } else {
            seconds = minutes * 60;
            return seconds;
        }
    }

    private static boolean minutesEqualsToZero(int minutes) {
        return minutes == 0;
    }

    private static boolean minutesLessThenZero(int minutes) {
        return minutes < 0;
    }
}
