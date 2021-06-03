package TopInterviewQuestions_Easy.DynamicProgramming;

// Using Kadane's algorithm dynamic programming
class Solution3 {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = nums[0];
        
        for(int i=1; i < nums.length; i++) {
        	current_sum  = Math.max(nums[i], current_sum+nums[i]);
        	max_sum = Math.max(max_sum, current_sum);
        }
        
        return max_sum;
    }
}

public class A3_Maximum_Subarray_largest_sum {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(s.maxSubArray(nums));
	}

}
