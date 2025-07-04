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
    public ListNode mergeNodes(ListNode head) {

        ListNode newhead=new ListNode(22);
        newhead.next=head;
        ListNode s=newhead;
        ListNode p=head;
        int sum=0;
        while(p.next!=null)
        {
            while(p!=null && p.val == 0)
            {
                p=p.next;
            }
            while( p!=null && p.val!=0)
            {
                sum=sum+p.val;
                p=p.next;
            }

           // ListNode a=new ListNode(sum);
            s.next.val=sum;
            s=s.next;
            sum=0;
        }
        s.next=null;
        return newhead.next;
        
    }
}