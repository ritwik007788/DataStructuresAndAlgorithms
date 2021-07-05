//Leetcode 13

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output_arr = new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || nums[i-1]!=nums[i]){
                int low = i+1;
                int high = nums.length-1;
                int sum = -1*nums[i];
                
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                        output_arr.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low]==nums[low+1])low++; //duplicates
                        while(low<high && nums[high]==nums[high-1])high--; // duplicates
                        low++; 
                        high--;
                        
                    }
                    
                    else if(nums[low]+nums[high]>sum){
                        high--;
                    }
                    
                    else{
                        low++;
                    }
                }
            }
        }
        return output_arr;
    }
}
