package TopInterviewQuestions_Easy.Array;

class Solution3 {
	
	public void reverse(int i,int j, int nums[]) {
		
		while( i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
		
	}
	
    public void rotate(int[] nums, int k) {
    	k %= nums.length; 		// check the remainder value because if k value is greather than array size exception occurs when reversing
    	reverse(0,nums.length-1,nums);
    	reverse(0,k-1,nums);
    	reverse(k,nums.length-1,nums);
    	
    }
}

public class A3_Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 3;
		int nums[] = {1,2,3,4,5,6,7};
		
		Solution3 s = new Solution3();
		
		s.rotate(nums,k);
		
		int m=0;
		
		while(m<nums.length) {
			System.out.println("\t"+nums[m]);
			m++;
		}
		
	}

}
