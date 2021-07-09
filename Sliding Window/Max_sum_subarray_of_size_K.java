// gfg


class Solution{
    static int maximumSumSubarray(int K, ArrayList<Integer> arr,int N){
        // code here
        int start = 0;
        int end = 0;
        
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        
        while(end < arr.size()){
            sum = sum + arr.get(end);
            
            if(end-start+1 < K){    // WINDOW SIZE IS (END-START+1).
                end++;
            }
            else if(end-start+1 == K){
                mx = Math.max(mx,sum);
                sum = sum - arr.get(start);
                start++;
                end++;
            }
            
        }
        
        return mx;
        
    }
}
