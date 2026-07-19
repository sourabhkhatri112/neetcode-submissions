class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[sell] < prices[buy]){ // Selling in loss
                buy = sell;
            } else {
                maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            }
                sell++;
        }
        return maxProfit;
    }

    /*public static void main() {
        System.out.println(new Solution().maxProfit(new int[]{5,1,5,6,7,1,10}));
    }*/

}
