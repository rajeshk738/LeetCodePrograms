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
class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
            
        ListNode temp1 = dummy;
        ListNode temp2 = dummy;
               
        for(int i=1; i<=n+1; i++){
            temp1 = temp1.next;
        }
        
        while(temp1 != null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        System.out.println(temp2.val);
        
        temp2.next = temp2.next.next;
        
        return dummy.next;

    }
}

public class A2_Remove_Nth_Node_from_End_of_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
