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
class Solution5 {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null)
            return false;
        if(head.next == null)
            return true;
        
        ListNode fast = head;
        ListNode slow = head;

        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode first_head = head;
        ListNode second_head = reverseLinkedList(slow);
        
        while(second_head != null && first_head != null){
            
            if(first_head.val != second_head.val)
                return false;
            else{
                first_head = first_head.next;
                second_head = second_head.next;
            }
        }
        
        
        return true;
    }
    
    private ListNode reverseLinkedList(ListNode head) {
        
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

public class A5_Palindrome_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
