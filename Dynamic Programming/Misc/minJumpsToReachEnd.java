//Leetcode 45
//Commented code is dp approach(O(N^2))

class Solution {
    public int jump(int[] arr) {
        int n = arr.length;
        if(arr[0] == 0 || n==0 || n==1) return 0;
        
//         int[] dp = new int[n];
//         // Arrays.fill(dp,Integer.MAX_VALUE);
//         dp[0] = 0;
        
//         for(int i = 1 ; i < n ; i++){
//             dp[i] = Integer.MAX_VALUE;
//             for(int j = 0 ; j < i ; j++){
//                 if(j+arr[j]>=i && dp[j]!=Integer.MAX_VALUE){
//                     dp[i] = Math.min(dp[i],1+dp[j]);
//                     break;
//                 }
//             }
//         }
//         if(dp[n-1]==Integer.MAX_VALUE) return -1;
//         return dp[n-1];
        
        int currEnd = 0;
        int currFarthest = 0;
        int jumps  = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            
            currFarthest  = Math.max(currFarthest , i+arr[i]);
            
            if(i==currEnd){
                jumps++;
                currEnd = currFarthest;
                if (currEnd >= arr.length - 1) {
					break;
				}
            }
        }
        
        return jumps;
    }
}
