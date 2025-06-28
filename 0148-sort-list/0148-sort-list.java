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
    static ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode ans=new ListNode(0);
        ListNode pointer=ans;

        while(l1!=null && l2!=null)
        {
            if(l1.val <= l2.val)
            {
                pointer.next=l1;
                l1=l1.next;
            }
            else
            {
                pointer.next=l2;
                l2=l2.next;
            }
            pointer=pointer.next;
        }
        //to cover the unequal number of elements..

        while(l1!=null)
        {
            pointer.next=l1;
            l1=l1.next;
            pointer=pointer.next;
        }
        
        while(l2!=null)
        {
            pointer.next=l2;
            l2=l2.next;
            pointer=pointer.next;
        }

        return ans.next;
    }

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null)
        {
            return head;
        }
        //finding half and diving it into two equal parts for merge sort...
        ListNode slowprev=head,slow=head,fast=head;

        while(fast!=null && fast.next!=null)
        {
            slowprev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        slowprev.next=null;
        //solving first half and second half seperately..
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);
        //return after merging accordingly..
        return merge(l1,l2);
    }
}