package TopInterviewQuestions_Easy.Array;

import java.util.HashSet;

class Solution4 {
    public boolean containsDuplicate(int[] nums) {
        boolean bool = false;
    	
        if(nums.length <= 1)
        	return bool;
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int x:nums) {
        	if(hs.contains(x)) {
        		bool = true;
        		break;
        	}
        	else {
        		hs.add(x);
        	}
        }
        
    	return bool;
    }
}


public class A4_Contains_Duplicate {

	public static void main(String[] args) {
		
		int[] nums = {1,2,1};
		
		Solution4 s = new Solution4();
		
		boolean bool = s.containsDuplicate(nums);
		
		System.out.println("Boolean value: "+bool);
		
	}

}
