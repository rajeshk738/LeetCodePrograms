package TopInterviewQuestions_Easy.Array;

class Solution {
    public int removeDuplicates(int[] nums) {
        
    	int i=0,j=1;
    	
    	int len = nums.length;
    	
    	if(len <= 0)
    		return 0;
    	else if(len == 1){
    		return 1;
    	}
    	else {
    	while(j<len) {
    		
    		if(nums[j] == nums[i]) {
    			j++;
    		}
    		else {
    			nums[i+1] = nums[j];
    			i++;
    			j++;
    		}
    		
    	}
    	return i+1;
    	}
    	
    	
    }
}

public class A1_RemoveDuplicates_from_SortedArray {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
		int output_length = s.removeDuplicates(nums);
		
		System.out.println("Output returned length\t"+output_length);
		
		System.out.println("\n Array Elements");
		
		for(int k=0;k<nums.length;k++) {
			System.out.println(nums[k]+"\t");
		}
	}
}
