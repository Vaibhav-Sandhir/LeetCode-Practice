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
        ListNode p = head;
        ListNode q = head;
        ListNode prev = null;

        if(head == null){
            return head;
        }

        for(int i = 0; i < n; i++){
            q = q.next;
        }

        while(q != null){
            prev = p;
            p = p.next;
            q = q.next;
        }

        if(p == head){
            return p.next;
        }

        prev.next = p.next;

        return head;
    }
}
