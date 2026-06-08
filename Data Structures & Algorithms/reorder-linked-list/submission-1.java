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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode slow2=head;
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        while(fast!=null && fast.next!=null){
            slow2=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        slow2.next=null;
        ListNode prev=null;
        ListNode cur=slow;
        ListNode next,p1,h1;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        while(prev!=null&&head!=null){
            p1=prev.next;
            h1=head.next;
            res.next=head;
            res=res.next;
            res.next=prev;
            res=res.next;
            prev=p1;
            head=h1;
            
        }
        if(prev!=null){
            res.next=prev;
        }else{
            res.next=head;
        }
        
        head=res.next;
    }
}
