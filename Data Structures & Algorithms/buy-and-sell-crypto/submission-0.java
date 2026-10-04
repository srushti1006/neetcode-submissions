class Solution {
    public int maxProfit(int[] prices) {
        int max=0,min=prices[0];
        for(int i = 1; i<prices.length ; i++)
        {
            min = min > prices[i] ? prices[i] : min;
            max = max > prices[i] - min ? max : prices[i] - min;
        }
        if(max > 0)
        {
            return max;
        }
        else{
            return 0;
        }
    }
}
