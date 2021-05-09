package TopInterviewQuestions.Array;
import java.util.Arrays;

class Solution6 {
    public int[] intersect(int[] nums1, int[] nums2) {
       
        int result[] = new int[nums1.length];
    	
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	
    	int k = 0;
    	int i=0,j=0;
    			
    while(i<nums1.length && j<nums2.length){
    		
    		if(nums1[i] == nums2[j]) {
    			result[k] = nums1[i];
    			k++;
    			i++;
    			j++;
    		}
    		else if(nums1[i] < nums2[j]) {
    			i++;
    		}
    		else {
    			j++;
    		}
  	
         	
    }
    	 return Arrays.copyOfRange(result,0,k);  // Copies only Array that stores only values other than zeros
}
    
}

public class A6_Intersection_of_Two_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution6 s = new Solution6();
		
		int nums1[] = {1,2,2,1};
		int nums2[] = {2,2};
		
		int result[] = s.intersect(nums1, nums2);
		
		for(int x:result) {
			System.out.println("\t"+x);			
		}

		
	}

}
