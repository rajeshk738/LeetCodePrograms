package TopInterviewQuestions_Easy.DynamicProgramming;

class Solution4 {
    public int rob(int[] nums) {
        if(nums.length == 1)
        	return nums[0];
        
        if(nums.length == 2){
            if(nums[0] > nums[1])
                return nums[0];
            else 
                return nums[1];
        }
        

    }
}

public class A4_House_Robber {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int nums[] = {1,2,3,1};
		System.out.println(s.rob(nums));

	}

}
