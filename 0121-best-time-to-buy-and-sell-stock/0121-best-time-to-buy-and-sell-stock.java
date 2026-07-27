class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            int currPrice = prices[i];
            if(currPrice < minPrice){
                minPrice = currPrice;
            }
            else{
                int profit= currPrice - minPrice;
                if (profit > maxProfit){
                    maxProfit = profit;
                }

            }
        }

        return maxProfit;
    }
}