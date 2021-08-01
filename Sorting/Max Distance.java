//InterviewBit

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        Pair[] B = new Pair[A.length];

        for(int i = 0 ; i < A.length ; i++){
            B[i] = new Pair(A[i],i);
        }

        Arrays.sort(B,(a,b) -> a.val<b.val?-1 : a.val>b.val?1 : 0); // sort based on values

        int index[] = new int[A.length];// store index in sorted value form

        for(int i = 0 ; i < A.length ; i++){
            index[i] = B[i].ind;
        }
      
      // Now we just have to find the maximum diff between elements in an arr

        int i = Integer.MAX_VALUE;//min element value
        int j = 0;//index
        int ans = 0;
        while(j<index.length){
            i = Math.min(i,index[j]);
            ans = Math.max(ans,index[j]-i);
            j++;
        }

        return ans;
    }

}

class Pair{
    int val;
    int ind;

    Pair(int val , int ind){
        this.val = val;
        this.ind = ind;
    }
}
