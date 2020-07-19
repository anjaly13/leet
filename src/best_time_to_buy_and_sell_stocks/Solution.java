package best_time_to_buy_and_sell_stocks;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String args[]){

        Solution solution= new Solution();
        System.out.println("profit :: "+solution.maxProfit(new int []{7,1,5,3,6,4}));
    }
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;int max=0;
        int profit =0;
        for (int i=0;i<prices.length;i++){
            if ((prices[i]-min) > max){
                max = prices[i]-min;
            }
            else {
                profit = profit + max;
                min = prices[i];
                max = 0;
            }
        }

        if (max > 0){
            profit = profit + max;
        }

        return profit;
    }
}
