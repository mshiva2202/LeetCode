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
    static ListNode reverse(ListNode r)
    {
        if(r==null || r.next==null ) return r;
        ListNode p1=null,p2=r,p3=r;
        while(p2!=null)
        {
            p3=p2.next;
            p2.next=p1;
            p1=p2;
            p2=p3;
        }
        return p1;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next==null) return head;
        ListNode newhead=new ListNode(22);
        newhead.next=head;
        ListNode a=newhead,b=head;
        ListNode c=newhead,d=head;

        while( d!=null && right > 0)
        {
            if(left > 1)
            {
                a=b;
                b=b.next;
            }
            left--;

            if( right > 0 )
            {
                c=d;
                d=d.next;
            }
            right--;
        }

        a.next=null;
        c.next=null;

       ListNode temp =reverse(b);

       a.next=temp;
       b.next=d;

       return newhead.next;
        
    }
}