// Leetcode #234

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        if(A==null || A.next == null) return 1;
        ListNode slow = A;
        ListNode fast = A;

        // we try to find the middle node + 1

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast!=null){
            slow = slow.next;
        }
// slow is the middle of the linkedlist + 1;

        ListNode newHead = rev(slow); // newHead is the right half LinkedList after reversal
        ListNode ogHead = A; // our old head
        while(newHead!=null){
            if(ogHead.val != newHead.val) return 0;
            newHead = newHead.next;
            ogHead = ogHead.next;
        }

        return 1;
      
    }

    public ListNode rev(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
