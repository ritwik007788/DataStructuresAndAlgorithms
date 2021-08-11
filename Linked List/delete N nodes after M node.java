class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        Node dummy = new Node(-1);
        dummy.next = head;
        
        Node curr = dummy.next;
        int count= 0;
        while(curr!=null){
            count++;
            
            if(count%M == 0){
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
