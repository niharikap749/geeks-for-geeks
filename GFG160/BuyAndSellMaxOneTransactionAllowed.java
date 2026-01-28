class Solution {
    public int maximumProfit(int prices[]) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++) {
            minPrice = Math.min(prices[i],minPrice);
            profit = Math.max(prices[i]-minPrice,profit);
        }
        return profit;
    }
}