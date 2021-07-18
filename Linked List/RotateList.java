//Leetcode 61

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null) return head;
        
        //finiding the length of the list
        
        int length = 1;
        ListNode temp = head;
        
        while(temp.next != null){
            temp = temp.next;
            length ++;
        }
        
        ListNode start = head;
        ListNode end = head;
        
        // In few cases K>length. Then in such cases we use the modulo operator
        
        if(k%length==0) return head; // if 0 rotations take place return head directy as 
                                     // further code doesn't work for 0 rotations.
        
        for(int i = 0 ; i < k%length ; i++){ // push the end index by k
            end = end.next;
        }
        
        while(end.next!=null){ // traverse till end
            start = start.next;
            end = end.next;
        }
        // baaki aap samajdar ho
        ListNode newHead = start.next;
        start.next = null;
        end.next = head;
        return newHead;
    }
}
