//Leetcode 147

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
    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head;
        ListNode dummy = new ListNode(-1);
        
        while(curr!=null){
            
            ListNode prev = dummy; // we start checking from the start
            
            while(prev.next != null && prev.next.val < curr.val){
                prev = prev.next; // until we find a greater value or reach the end
            }
            
            ListNode next = curr.next; // next pos of current
            curr.next = prev.next; // we append curr to result(dummy) list hence we
                                   // need to add the values of result list after curr
            prev.next = curr; //updating the result list
            
            curr = next; // updating curr for next iteration
        }
        
        return dummy.next; // returning the ans
    }
}
