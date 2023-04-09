package leetcode;

public class ex121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int cur = prices[0];
        for (int i = 1; i < prices.length; i++){
            int temp = prices[i] - cur;
            if(temp <0){
                cur = prices[i];
            }

        }
        return max;
    }
}
