package TopInterviewQuestions_Easy.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution3 {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode next = null;
        ListNode cur = head;
        
        while(cur != null){
            
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            
        }
        
        return prev;
    }
}

public class A3_Reverse_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
