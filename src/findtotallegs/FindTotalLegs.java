package findtotallegs;

public class FindTotalLegs {

    public int findChickenLegs(int chickenLegs, int cowLegs, int oxLegs) {
        int totalLegs = 0;
        int noOfChickenLegs = chickenLegs * 2;
        int noOfCowLegs = cowLegs * 4;
        int noOfOxLegs = oxLegs * 4;
        totalLegs = noOfChickenLegs + noOfCowLegs + noOfOxLegs;
        return totalLegs;
    }
}
