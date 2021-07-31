//Leetcode 23

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
    
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists==null || lists.length==0) return null;
        
        ListNode head =  null;
        ListNode tail = null;
        
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode o1, ListNode o2)
                    {
                    if (o1.val<o2.val)
                        return -1;
                    else if (o1.val==o2.val)
                        return 0;
                    else 
                        return 1;
                    }
        });
        
        for(int i = 0 ; i < lists.length ; i++){
            if(lists[i]!=null) // if head of an element in the list is null
            minHeap.add(lists[i]);
        }
        
        while(minHeap.size()>0){
            ListNode top = minHeap.poll();
            
            if(top.next!=null){
                minHeap.add(top.next);
            }
            
            if(head==null){
                head = top;
                tail = top;
            }
            else{
                tail.next = top;
                tail = top;
            }
            
            
        }
        return head;
        
    }
}
