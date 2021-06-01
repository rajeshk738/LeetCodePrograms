package TopInterviewQuestions_Easy.Others;

class Solution6 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        
        for(int c : nums) {
        	sum += c;
        }
        int expected_sum = nums.length * (nums.length + 1) / 2;
    	int result = expected_sum - sum;
    	
    	return result;
    }
}

public class A6_Missing_Number {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		int nums[] = {3,0,1};
		System.out.println(s.missingNumber(nums));

	}

}
