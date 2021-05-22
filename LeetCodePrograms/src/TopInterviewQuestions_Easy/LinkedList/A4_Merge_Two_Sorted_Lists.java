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

class Solution4 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        
        if(l1 == null)
        {
            head = l2;
            return head;
        }
        else if(l2 == null){
            head = l1;
            return head;
        }
        
        if(l1.val <= l2.val){
            temp = l1;
            l1 = l1.next;
            head = temp;
        }
        else{
            temp = l2;
            l2 = l2.next;
            head = temp;
        }
        
        while(l1 != null && l2 != null){
            
            if(l1.val <= l2.val){
                
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
                
            }
            else {
             
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
                
            }
            
            
            System.out.println(temp.val);
        }
            
            if(l1 == null){
                while(l2 != null){
                    temp.next = l2;
                    temp = l2;
                    l2 = l2.next;
                    System.out.println(temp.val);
                }
            }
        else if(l2 == null){
            while(l1 != null){
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
                System.out.println(temp.val);
            }
        }

            return head;
    }
}

public class A4_Merge_Two_Sorted_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
