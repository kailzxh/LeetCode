class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int min=Integer.MAX_VALUE;  
        int maxProfit = 0;
       for(int i=0;i<prices.length;i++){
        min = Math.min(min,prices[i]);
        maxProfit =Math.max(maxProfit,prices[i]-min);
       }
       if(maxProfit<0){
        return 0;
       }
    return maxProfit;
    }
}