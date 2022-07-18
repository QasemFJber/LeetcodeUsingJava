class Solution {
    public int maxProfit(int[] prices) {
        int minB = prices[0],maxS = 0;
        for (int i=0;i<prices.length;i++){
            if(prices[i]<minB){
                minB=prices[i];
            } else if (prices[i] - minB > maxS)
                maxS = prices[i] - minB;
        }
        return maxS;
    }
}