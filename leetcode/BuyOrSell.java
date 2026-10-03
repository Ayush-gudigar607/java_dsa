// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int max_profit=0;
        int profit=0;

        for(int i=1;i<n;i++)
        {
            if(prices[i]>prices[i-1])
            {
            // min=Math.min(min,prices[i]);
            profit += prices[i] - prices[i - 1] ;   
            max_profit=Math.max(max_profit,profit);
            }

        }

        return max_profit;
    }
}