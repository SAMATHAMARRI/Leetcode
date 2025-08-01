class Solution {
    public int maxProfit(int[] prices) {
        int buyingPrice = prices[0], profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(buyingPrice > prices[i]){
                buyingPrice = prices[i];
            }
            else{

                profit = Math.max(profit, prices[i] - buyingPrice);
            }

        }
        return profit;
    }
}