//Leetcode 82

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
    public ListNode deleteDuplicates(ListNode A) {
        if(A==null || A.next==null) return A;
        HashSet<Integer> hs = new HashSet<>();
        ListNode prev = A;
        ListNode curr = A.next;
        ListNode dummy = new ListNode(69);
        ListNode node = dummy;

        while(curr!=null){
            if(!hs.contains(prev.val) && prev.val == curr.val){
                hs.add(prev.val);
            }
            else if(prev.val != curr.val && !hs.contains(prev.val)){
                node.next = new ListNode(prev.val);
                node = node.next;
            }
            curr = curr.next;
            prev = prev.next;
        }
        if(!hs.contains(prev.val)) node.next = prev;
        return dummy.next;
    }
}
