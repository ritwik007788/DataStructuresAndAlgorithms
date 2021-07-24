//Leetcode 152

class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
      //initializing
        int maxSoFar = nums[0]; 
        int minSoFar = nums[0]; // to deal with negative nos.
        int result  = maxSoFar;
        
        for(int i = 1 ; i < nums.length ; i++){
            int curr = nums[i];
            int temp = Math.max(curr,Math.max(curr*maxSoFar,curr*minSoFar));
            minSoFar = Math.min(curr,Math.min(curr*maxSoFar,curr*minSoFar));
            maxSoFar = temp;
            
            result  = Math.max(maxSoFar,result);
        }
        return result;
    }
}
