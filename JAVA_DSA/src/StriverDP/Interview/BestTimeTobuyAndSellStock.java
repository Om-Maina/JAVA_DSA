package StriverDP.Interview;

public class BestTimeTobuyAndSellStock {
    public static int Maxprofit(int[] price) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < price.length; i++) {
            if (price[i] < minprice)
                minprice = price[i];
            else if (price[i] - minprice > maxprofit)
                maxprofit = price[i] - minprice;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] price= {7,1,4,3,6};
        System.out.println(Maxprofit(price));
    }
}