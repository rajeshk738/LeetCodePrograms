package TopInterviewQuestions_Easy.Array;


class Solution2 {
    public int maxProfit(int[] prices) {
    	
    	int total_profit = 0;
    	
    	for(int i=0,j=1;i<prices.length && j<prices.length;i++,j++) {
    		
    		if(prices[j] > prices[i]) {
    			total_profit += prices[j] - prices[i];
    		}
    		
    	}
    	
    	return total_profit;
    }
}

public class A2_BestTime_to_BuyAndSell_Stocks_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 s = new Solution2();
		
		int prices[] = {7,1,5,3,6,4};
		
		int max_profit = s.maxProfit(prices);
		
		System.out.println("Max profit: "+max_profit);
	}

}
