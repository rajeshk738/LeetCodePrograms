package TopInterviewQuestions_Easy.LinkedList;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 class Solution6 {
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null)
            return false;
        
        ListNode fast = head.next;
        ListNode slow = head;
        
        while(slow != fast){
            
            if(fast == null || fast.next == null)
                return false;
           
            slow = slow.next;
            fast = fast.next.next;
            }
        
        
        return true;        
    }
}


public class A6_LinkedList_Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
