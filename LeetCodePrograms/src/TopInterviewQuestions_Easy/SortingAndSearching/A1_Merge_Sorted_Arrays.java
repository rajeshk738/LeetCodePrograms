package TopInterviewQuestions_Easy.SortingAndSearching;

class Solution1 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        int k = m+n - 1;
        
        while(j >= 0) {
        	
        	if(i >= 0 && nums1[i] > nums2[j]) {
        		nums1[k--] = nums1[i--];
        	}
        	else {
        		nums1[k--] = nums2[j--];
        	}
        }
        
        }
}


public class A1_Merge_Sorted_Arrays {

	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		
		Solution1 s = new Solution1();
		s.merge(nums1, m, nums2, n);
		
		for(int x:nums1) {
			System.out.println("\t"+x);
		}
		

	}

}
