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
    static int findlen(ListNode r)
    {
        int len=0;
        while(r!=null)
        {
            len++;
            r=r.next;
        }
        return len;
    }
    public ListNode swapNodes(ListNode head, int k) 
    {
        if(head==null || head.next==null) return head;
        int len=findlen(head);
        ListNode p=head;
        int n=1;
        while(n<k)
        {
            n++;
            p=p.next;
        }
        ListNode a=p;

        p=head;
        len=len-k+1;
        n=1;
        while(n<len)
        {
            p=p.next;
            n++;
        }

        ListNode b=p;

        int temp=a.val;
        a.val=b.val;
        b.val=temp;

        return head;

    }
}