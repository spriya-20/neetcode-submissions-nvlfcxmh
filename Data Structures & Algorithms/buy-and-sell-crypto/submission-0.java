class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int left = 0;
        int right = 1;
        while (right < prices.length) {
            if(prices[left] < prices[right]){
                maxPro= Math.max(maxPro, prices[right]-prices[left]);
            }
            else {
                left = right;
            }
            right++;
        }
        return maxPro;
    }
}
