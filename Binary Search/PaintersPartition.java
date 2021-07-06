//Interviewbit


public class Solution {
    public int paint(int A, int B, int[] C) {
        
        int start = 0;
        int end = 0;
        int n = C.length;
        for(int i = 0 ; i<n ; i++){
            start = Math.max(C[i],start);
            end += C[i];
        }
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isValid(mid,A,C)){
                res = mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        long timeTaken = res*(long)B;
        return (int)(timeTaken%10000003);
    }
    public boolean isValid(int mid,int A , int[] C){
        int painters = 1;
        int sum = 0;
        for(int i =0 ; i< C.length;i++){
            sum+=C[i];
            if(sum>mid){
                painters++;
                sum = C[i];
            }
            if(painters>A){
                return false;
            }
            
        }
        return true;
    }
}
