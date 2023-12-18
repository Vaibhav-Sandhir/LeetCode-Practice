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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode p = head;
        ListNode q = head;

        while(q != null && q.next != null){
            p = p.next;
            q = q.next.next;
        }

        ListNode curr = p;
        ListNode prev = null;
        
        while(curr != null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

        q = head;
        while(q != null && prev != null){
            if(q.val != prev.val){
                return false;
            }
            q = q.next;
            prev = prev.next;
        }
        
        return true;
    }
}
