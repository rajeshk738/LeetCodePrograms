package TopInterviewQuestions_Easy.Trees;


 //Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
    TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
 

/**
 * @author kandi
 *
 */
class Solution5 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length-1);
    }
    private TreeNode createBST(int[] nums, int low, int high){
        if(low > high)
            return null;
        
        int mid = (low + high) / 2 ;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createBST(nums, low, mid - 1);
        node.right = createBST(nums, mid+1, high);
        return node;
    }
    
}

public class A5_Convert_SortedArray_To_HeighBalanced_BST {

	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60,70,80,90};
		Solution5 s = new Solution5();
		s.sortedArrayToBST(arr);
	}

}
