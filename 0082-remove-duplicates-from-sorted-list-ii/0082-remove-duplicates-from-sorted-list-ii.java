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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode newhead=new ListNode(22);
        newhead.next=head;
        ListNode prev=newhead;
        ListNode cur=head;
        
        while(cur!=null)
        {
            boolean isdup=false;

            while(cur.next!=null && cur.val == cur.next.val)
            {
                isdup=true;
                cur=cur.next;
            }
            //if cur node is dup we consider next node might be unique...........
            if(isdup)
            {
                prev.next=cur.next;
            }
            else
            {
                prev=prev.next;
            }

            cur=cur.next;
        }
            prev.next=null;

            return newhead.next;
 
    }
}