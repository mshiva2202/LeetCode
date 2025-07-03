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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        if(head.next == null) return null;

        ListNode newhead=new ListNode(22);
        newhead.next=head;
        
        ListNode slow=newhead;
        ListNode fast=head;
    
        while(fast.next!=null)
        {
            if(n>1)
            {
                fast=fast.next;
                n--;
            }
            else
            {
                slow=slow.next;
                fast=fast.next;
            }
        }

        if(slow.next!=null)
            slow.next=slow.next.next;
        else
            slow.next=null;
        
        return newhead.next;
        
    }
}