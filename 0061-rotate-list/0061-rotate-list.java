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
    static ListNode rotate(ListNode r)
    {
        ListNode prev=null;
        ListNode cur=r;
        while(cur.next!=null)
        {
            prev=cur;
            cur=cur.next;
        }

        prev.next=null;
        cur.next=r;

        return cur;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;

        int len=0;
        ListNode p=head;
        while(p!=null)
        {
            len++;
            p=p.next;
        }
        k=k%len;
        if(k==0) return head;

        while(k-->0)
        {
            head=rotate(head);
        }

        return head;
        
    }
}