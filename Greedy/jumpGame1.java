//Leetcode 

class Solution {
    public boolean canJump(int[] nums) {
      //edge cases
        if(nums[0]==0 && nums.length > 1 ) return false;
        if(nums[0]==0 || nums.length == 1) return true;
        // max index we can reach
        int max  = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            if(i<=max){ // if we havent reaced the max index
                max = Math.max(max, nums[i]+i); // updating max index we can reach
            }
            else{
                return false; // if we cross the max index then reaching the end is not possible
            }
          
            if(max >= nums.length){ // if max has reached end already then return true;
                return true;
            }
            
        }
        return true;
        
        
    }
}
