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

            ListNode a=new ListNode(sum);
            s.next=a;
            s=a;
            sum=0;
        }

        return newhead.next;
        
    }
}