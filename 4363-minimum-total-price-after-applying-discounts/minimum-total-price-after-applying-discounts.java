class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=prices.length-1;
        int j=discounts.length-1;
        double f_price=0;
        while(i>=0 && j>=0){
            int p=prices[i];
            int d=discounts[j];
            double price=(p * (100 - d)) / 100.00;
            f_price=f_price+price;
            i--;
            j--;
        }
        while(i>=0){
            f_price=f_price+prices[i];
            i--;
        }
        return f_price;
    }
}