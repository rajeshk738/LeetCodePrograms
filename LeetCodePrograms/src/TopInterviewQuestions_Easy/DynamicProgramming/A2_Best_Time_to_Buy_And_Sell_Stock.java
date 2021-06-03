package TopInterviewQuestions_Easy.DynamicProgramming;

class Solution2 {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        
        for(int i=0; i < prices.length; i++){
            if(prices[i] < min_price)
            	min_price = prices[i];
            
            if(prices[i] - min_price > max_profit)
            	max_profit = prices[i] - min_price;
        }
        return max_profit;
    }
}

public class A2_Best_Time_to_Buy_And_Sell_Stock {

	public static void main(String[] args) {
		Solution2 s= new Solution2();
		int prices[] = {7,6,4,3,1};
		System.out.println(s.maxProfit(prices));

	}

}
