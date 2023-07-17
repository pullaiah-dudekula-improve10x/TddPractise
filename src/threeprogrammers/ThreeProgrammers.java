package threeprogrammers;

public class ThreeProgrammers {

    public int threeProgrammers(int wage1, int wage2, int wage3) {
        if (wage1 <= 0 || wage2 <= 0 || wage3 <= 0) {
            return -1;
        } else {
            int difference = 0;
            int maxPaid = 0;
            int minPaid = 0;
            if (wage1 > wage2 && wage1 > wage3) {
                maxPaid = wage1;
            } else if (wage2 > wage3) {
                maxPaid = wage2;
            } else {
                maxPaid = wage3;
            }
            if (wage1 < wage2 && wage1 < wage3) {
                minPaid = wage1;
            } else if (wage2 < wage3) {
                minPaid = wage2;
            } else {
                minPaid = wage3;
            }
            difference = maxPaid - minPaid;
            return difference;
        }
    }
}