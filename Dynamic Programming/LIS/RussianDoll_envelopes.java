//Leetcode 354

class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        
        // sort width in asc and height in decs(if width is equal)
        Arrays.sort(envelopes, new Comparator<int[]>(){
        public int compare(int[] arr1, int[] arr2){
            if(arr1[0] == arr2[0])
                return arr2[1] - arr1[1]; // sort height in desc if width is equal
            else
                return arr1[0] - arr2[0]; // sort width in ascending
       } 
    });
        
        // creating an array of lengths
        
        int[] length = new int[envelopes.length];
        
        for(int i = 0 ; i < envelopes.length ; i++){
            length[i] = envelopes[i][1];
            
        }
        
        return LIS(length,length.length);
        
    }
    public int LIS(int arr[],int n)
    {
        
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1 ; i < n ; i++){
            dp[i] = 1 ;
            for(int j = 0 ; j < i ; j++){
                if(arr[i]>arr[j] && dp[i]<1+dp[j]){
                    dp[i] = 1 + dp[j];
                }
            }
        }
        return max(dp);
        
    }
    
    public int max(int[] arr){
        int max = 0;
        for(int i =0 ; i<arr.length;i++){
            if(max<arr[i]) max = arr[i];
        }
        return max;
    }
}
