//gfg

/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
        if(head==null || head.next==null)
            return head;
        
        Node mid = findMid(head);
        Node newHead = mid.next;
        mid.next = null;
        
        return merge(mergeSort(head),mergeSort(newHead));
    }

    
    static Node merge(Node l1 , Node l2){
        if(l1==null) return l2;
        if(l2 == null) return l1;
        
        if(l1.data<l2.data){
            l1.next= merge(l1.next,l2);
            return l1;
        }
        else{
            l2.next = merge(l1,l2.next);
            return l2;
        }
    }
    
    static Node findMid(Node head){
        Node f = head;
        Node s = head;
        while(f.next!=null && f.next.next!=null){
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
}
