//Leetcode 128

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int num : nums){
            hs.add(num);
        }
        int count  = 0;
        int lcs  = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(!hs.contains(nums[i]-1)){
                count = 1;
                int ele = nums[i];
                while(hs.contains(ele+1)){
                    count++;
                    ele++;
                }
                lcs = Math.max(count,lcs);
                
            }
            
        }
        return lcs;
    }
}
