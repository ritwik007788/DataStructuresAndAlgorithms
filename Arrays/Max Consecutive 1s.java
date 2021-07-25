//leetcode 487

// using sliding window 

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int j = 0;
        int zeroCount = 0;
        int max = 0;
        for(; j < nums.length ; j++){
            if(nums[j]==0)
                zeroCount++;
            
            while(zeroCount>1){
                if(nums[i]==0)zeroCount--;
                i++;
            }
            
            int window = j - i + 1;
            max = Math.max(window,max);
        }
        return max;
    }
}
