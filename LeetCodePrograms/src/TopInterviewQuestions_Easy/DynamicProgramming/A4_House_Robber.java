package TopInterviewQuestions_Easy.DynamicProgramming;

class Solution4 {
	    public int rob(int[] nums) {
	        if(nums.length == 1)
	        	return nums[0];
	        
	        if(nums == null || nums.length == 0)
	            return 0;
	        
	        int robNext = nums[nums.length-1];
	        int robNextPlusOne = 0;
	        
	        for(int i = nums.length - 2; i >= 0; i--){
	            int cur = Math.max(robNext, robNextPlusOne + nums[i]);
	            robNextPlusOne = robNext;
	            robNext = cur;
	        }
	        
	    return robNext;
	    }
	}


public class A4_House_Robber {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int nums[] = {1,2,3,1};
		System.out.println(s.rob(nums));

	}

}
