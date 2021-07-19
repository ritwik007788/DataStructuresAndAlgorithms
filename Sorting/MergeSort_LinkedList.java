//Leetcode 148

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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode mid = findMid(head);// finding mid
        ListNode newHead = mid.next;
        mid.next = null;
        
        return merge(sortList(head),sortList(newHead));// calling merge on two sorted lists
    }
    
    //Merge two sorted lists generic code
    public ListNode merge(ListNode A, ListNode B){
        if(A==null) return B;
        if(B==null) return A;
        ListNode dummy = new ListNode(0);
        ListNode curr1 = A;
        ListNode curr2 = B;
        ListNode node = dummy;
        while(curr1!=null && curr2!=null){
            if(curr2.val <= curr1.val){
                node.next = new ListNode(curr2.val);
                node = node.next;
                curr2 = curr2.next;
            }
            else{
                node.next = new ListNode(curr1.val);
                node = node.next;
                curr1 = curr1.next;
            }
            
        }

        if(curr1!=null){
            node.next = curr1; 
        }
        else{
            node.next = curr2;
        }
        return dummy.next;
        

    }
    
    //Function to find mid
    public ListNode findMid(ListNode head){
        ListNode f = head;
        ListNode s = head;
        while(f.next!=null && f.next.next!=null){
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
}
