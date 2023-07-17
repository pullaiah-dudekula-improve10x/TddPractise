package finddiscount;

public class FindDiscount {

    public double findDiscount(int price, int percentage) {
        if (priceIsEqualToZero(price) == 0 && percentageIsEqualToZro(percentage)) {
            return -1;
        } else {
            double finalPrice = 0;
            double discountPrice = price * percentage / 100;
            finalPrice = price - discountPrice;
            return finalPrice;
        }
    }

    private static boolean percentageIsEqualToZro(int percentage) {
        return percentage == 0;
    }

    private static int priceIsEqualToZero(int price) {
        return price;
    }
}