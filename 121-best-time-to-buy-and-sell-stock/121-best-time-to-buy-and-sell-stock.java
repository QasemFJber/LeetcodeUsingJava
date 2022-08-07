class Solution {
   fun maxProfit(prices: IntArray): Int {
        var minB = prices[0]
        var max = 0

        for (i in prices.indices){
            if (prices[i] <minB)
                minB = prices[i]
            else if (prices[i] - minB > max)
                max = prices[i]-minB
        }
        return max
    }
}