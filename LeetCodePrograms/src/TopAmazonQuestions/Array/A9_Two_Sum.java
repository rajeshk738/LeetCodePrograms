package TopAmazonQuestions.Array;

import java.util.Hashtable;

class Solution9 {
    public int[] twoSum(int[] nums, int target) {
        
    	Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
    	
    	h.put(nums[0], 0);
    	
    	for(int i=1;i<nums.length;i++)
    	{
    		int value = target - nums[i];
    		
    		if(h.containsKey(value)) {
    			return new int[]{h.get(value),i};
    		}
    		else {
    			h.put(nums[i], i);
    		}
    	}

        return new int[]{-1,-1};
    }
}

public class A9_Two_Sum {
	
	public static void main(String[] args) {
		
		int nums[] = {3,2,4};
		int target = 5;
		Solution9 s = new Solution9();
		int a[] = s.twoSum(nums, target);
		
		System.out.println(a[0]+" "+a[1]);
		
		
	}

}
