package TopInterviewQuestions_Easy.Array;

class Solution8 {
    public void moveZeroes(int[] nums) {
        
    	int i=0; int j=0;
    	
    	if(nums.length > 1) {
         	while(i<nums.length && j<nums.length) {
    		
    		if(nums[i] != 0) {
    			nums[j] = nums[i];
    			i++;
    			j++;
    		}
    		else {
    			i++;
    		}
    		
    	}
    	
    	while(j < nums.length) {
    		nums[j] = 0;
    		j++;
    	}
    	
    }
    }
}

public class A8_Move_Zeroes {

	public static void main(String[] args) {
		
		int nums[] = {1,0};
		Solution8 s = new Solution8();
		s.moveZeroes(nums);
		
		for(int i=0;i<nums.length;i++)
		System.out.print("\t"+nums[i]);
		
	}

}
