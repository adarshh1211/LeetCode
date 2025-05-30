class Solution {
    public int maxProfit(int[] prices) {
        int minbuy=prices[0];
        int profit=0;

        for(int price:prices)
        {
            minbuy =Math.min(minbuy,price); // 7
            profit = Math.max(profit,price-minbuy);

        }
        return profit;
        
    }
}