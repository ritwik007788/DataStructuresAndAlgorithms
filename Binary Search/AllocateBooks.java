//gfg

public class Solution {
    public int books(int[] A, int B) { // A->List of books , B-> number of students
        if(A.length<B) return -1; // students are more than the number of books
        
        int start =  0;
        int end = 0;

        for(int i=0;i<A.length;i++){
            start = Math.max(start,A[i]);// start is the maximum book size 
            end += A[i]; 
        }

        int res = -1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(isValid(mid,A,B)){ // checks if mid number of pages are valid
                res = mid; // mid is a possible ans
                end = mid-1; // we try to minimize mid
            }
            else{
                start = mid+1; 
            }
        }

        return res;

    }

    public boolean isValid(int mid , int[] A , int B){
        int student = 1;
        int currsum = 0;
        for(int i = 0 ; i < A.length ; i++){
            currsum+=A[i];
            if(currsum>mid){
                student++;
                currsum = A[i];
            }
            if(student > B){
                return false;
            }
        }
        return true;
    }
}
