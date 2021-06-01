package TopInterviewQuestions_Easy.Trees;



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution1 {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else{
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }
}

public class A1_Maximum_Depth_of_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
