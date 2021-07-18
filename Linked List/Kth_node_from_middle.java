//InterviewBit

public class Solution {
    public int solve(ListNode A, int B) {
        //First we find mid
        ListNode mid = A ;
        ListNode j = A;
        int count = 0 ;
        while(j!=null && j.next!=null){
            mid = mid.next;
            j = j.next.next;
            count++;
        }
        // if B is greater than the index of mid we return -1
        if(B>count) return -1;
        
        j = A;
        ListNode i = A;
        // we create a diff of B between i & j
        for(int x = 0 ; x < B ; x++){
            j = j.next;
        }
        // we traverse till we reach mid
        while(j!=mid){
            i = i.next;
            j = j.next;
        }
        // we return the result
        return i.val;


    }
}
