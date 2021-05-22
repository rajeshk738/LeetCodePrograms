package TopInterviewQuestions_Easy.LinkedList;

 // Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution1 {
    public void deleteNode(ListNode node) {
        
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}

public class A1_Delete_Node_in_a_LinkedList {

	public static void main(String[] args) {
		
		Solution1 s = new Solution1();
		

	}

}
