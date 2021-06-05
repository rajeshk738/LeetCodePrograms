package TopInterviewQuestions_Easy.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
class Solution4 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        
        if(root == null)
            return levels;
        
     Queue<TreeNode> queue = new LinkedList<>();
     queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i=0; i < size; i++){
                TreeNode current_node = queue.remove();
                list.add(current_node.val);
                
                if(current_node.left != null)
                    queue.add(current_node.left);
                
                if(current_node.right != null)
                    queue.add(current_node.right);
            }
            levels.add(list);
        }
        return levels;
        
        
    }
}

public class A4_Binary_Tree_level_order_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
