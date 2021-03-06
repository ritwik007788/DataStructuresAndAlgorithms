// Leetcode #34

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end =nums.length-1;
        int res1 = -1; //first occurence
        int res2 = -1; //last occurence
        
        // base case
        if(nums == null || nums.length == 0)
            	return new int[]{-1, -1 };
        
        // first occurence
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target){
                res1 = mid; // storing possible 1st occurences
                end = mid-1; //checking for other occurences to the left
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        
        //last occurence
        start =0;
        end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target){
                res2 = mid;// storing possible last occurences
                start = mid+1;// checking for other occurences to the right
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        
        
        int[] num = {res1,res2};
        return num;
    }
}
