//Leetcode 1836

class Solution {
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        
        if(head == null || head.next==null ) return head;
        
        //Use HashMap to store freq of all elements
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode curr = head;
        while(curr!=null){
            map.put(curr.val,map.getOrDefault(curr.val,0)+1);
            curr = curr.next;
        }
        // check freq of elements and append to the dummy node
        curr = head;
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        
        while(curr!=null){
            if(map.get(curr.val)==1){
                node.next = new ListNode(curr.val);
                node = node.next;
            }
            curr = curr.next;
        }
        
        return dummy.next;
        
        
    }
}
