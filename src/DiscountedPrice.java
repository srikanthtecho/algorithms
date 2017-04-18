/**
 * Created by Lenovo on 12-04-2017.
 */
public class DiscountedPrice {

    public static void main(String args[]) {

        int[] prices = new int[]{5, 1, 3, 4, 6, 2};
        int total = discountedPrice(prices);

        if(total == 14) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }

    }

    private static int discountedPrice(int[] prices) {

        int discountedPriceTotal = 0;
        String nonDiscount = "";
        for (int i = 0; i < prices.length; i++) {

            int discount = 0;
            boolean discounted = false;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    discount = prices[i] - prices[j];
                    discounted = true;
                    break;
                }
            }

            if (discounted == false) {
                discount = prices[i];
                nonDiscount = prices[i] + ", ";
            }
            discountedPriceTotal = discountedPriceTotal + discount;
        }

        System.out.println(discountedPriceTotal);
        System.out.println(nonDiscount);

        return discountedPriceTotal;
    }
}
