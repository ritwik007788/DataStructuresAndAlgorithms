//gfg
class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        
        Node curr =head;
        int count= 0;
        while(curr!=null){
            count++;
            
            if(count%M == 0){// we have traversed M nodes
                int temp = N;
                while(curr.next!=null && temp!=0){
                    Node next = curr.next.next;
                    curr.next = next;
                    temp--;
                }
            }
            
            curr = curr.next;
            
        }
    }
}
