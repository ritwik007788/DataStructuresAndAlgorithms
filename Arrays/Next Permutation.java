//Leetcode 31


//Algorithm :
// 1. traverse from the end and find the point where decresing order(increasing from the end) ends. 
// 2.That point is i(i is 1 index less than the rightmost peak value).
// 3.Again traverse from the end and find a point just greater than i.
// 4.That point is j
// 5.swap i & j . Since we want to find the NEXT greater element we swap i with the smallest greater element
// 6.reverse in ascending order from i+1.This is done so that higher elements have the least weightage.

class Solution {
    public void nextPermutation(int[] nums) {
        //traverse from the end and find the point where decresing order(increasing from the end) ends. 
        int i = nums.length - 2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        // if i == -1 it means that we only need to reverse the array as the given array is in decending order.
        if(i>=0){ 
            // Again traverse from the end and find a point just greater than i.
            int j = nums.length - 1;
            
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
