package TopAmazonQuestions.Array;

class Solution5 {
    public int singleNumber(int[] nums) {
        
    	int a = 0;
    	
    	for(int x: nums) {
    		a ^= x;
    	}
    	
    	return a;
    }
}

public class A5_Single_Number {

	public static void main(String[] args) {
		
		int[] nums = {4,1,2,1,2};
		
		Solution5 s = new Solution5();
		
		int value = s.singleNumber(nums);
		
		System.out.println("Single number: "+value);
		
	}

}
