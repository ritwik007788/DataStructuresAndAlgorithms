#Leetcode 189

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k>n) k %= nums.length; // if k is greater than the length of array
        rev(n-k,n-1,nums);
        rev(0,n-k-1,nums);
        rev(0,n-1,nums);
        
    }
    
    public void rev(int start, int end , int[] nums){
        
        while(start<end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start ++;
            end -- ;
        }
    }
}
