//Leetcode 169

class Solution {
    public int majorityElement(int[] nums) {
        int count  = 0;
        int major = -1;
        for(int num : nums){
            if(count == 0){ // when count == 0 then majority = minority
                major = num; // we take the left element of the new window as major 
            }
            if(num == major){ // as we encounter major elements we increase their count
                count++;
            }
            else{ // we decrease the count if we find minor elements
                count--;
            } 
        }
        
        return major;
        
    }
}
