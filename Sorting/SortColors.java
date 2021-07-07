//Leetcode 75

//O(N) sorting for elements in array using constant space(i.e inplace).Use this method when we have to sort an array of 0's,1's and 2's.

class Solution {
    public void sortColors(int[] nums) {
        int curr = 0 , p0 = 0 , p2 = nums.length-1;
        
        while(curr<=p2){
            if(nums[curr]==0){
                int temp =  nums[curr];
                nums[curr] = nums[p0];
                nums[p0] = temp;
                p0++;
                curr++;
            }
            else if(nums[curr]==1){
                curr++;
            }
            else{
                int temp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2] = temp;
                p2--;
            }
        }
    }
}
