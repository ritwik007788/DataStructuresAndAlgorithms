//Leetcode #33

// find the minimum element
//index of min element = no. of rotations
// then do bsearch from 0 to min-1 and min to end

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        // base condition
        if(n == 1){
            if (nums[0]==target)return 0;
            else return -1;
        }
        // if array is already sorted i.e not rotated
        if(nums[0]<nums[n-1]){
            return bsearch(0,n-1,target,nums);//bsearch(start,end,target,array)
        }
        
        // finding the minimum element
        int l =0;
        int r = n-1;
        int index = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            
            int next = (mid+1)%(nums.length);
            int prev =(mid+nums.length-1)%nums.length;
            if(nums[mid]<nums[prev] && nums[mid]<nums[next]){
                index = mid;
                break;
            }
            
            else if(nums[0]<=nums[mid])l=mid+1;
            
            else if(nums[nums.length-1]>=nums[mid])r=mid-1;
            
        }
        
        // index is the index of the minimum element
        
        int res =-1;
        
        res = bsearch(0,index-1,target,nums);
        if(res==-1){
            res = bsearch(index,n-1,target,nums);
        }
        return res;
    }
    
    public int bsearch(int l,int r , int target,int[] nums){
        
        while(l<=r){
           int mid = l+(r-l)/2;
           if(nums[mid]==target)return mid;
            else if (nums[mid]>target) r = mid-1;
            else  l = mid +1;
        }
        return -1;
        
    }
}
