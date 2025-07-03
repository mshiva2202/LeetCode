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
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode prev=null,a=head,b=null,c=null;
        while(a!=null && a.next!=null)
        {
                b=a.next;
                c=b.next;
                if(a==head)
                {
                    head=b;
                }
                else{
                    prev.next=b;
                }

                a.next=c;
                b.next=a;
                prev=a;
                a=c;
        }

        return head;

        
    }
}