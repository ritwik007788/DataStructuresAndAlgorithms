// leetcode #4

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == nums2.length && nums1.length ==0) {return 0.0;}
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        
        int length1 = nums1.length;
        int length2 = nums2.length;
        
        int low = 0; 
        int high = length1;
        
        while(low<=high){
         
            int part1 = (low+high)/2;
            int part2 = (length1+length2+1)/2 - part1; //+1 so that we always have partitions that have left side equal or greater than the right side by one
            // we will write the other function so that if the sum is odd, take the element on the left side as mean. 
                        
            
            //we assign the value to the variables. This are the four number which will be considered when getting a median, they just need to satisy one condition i.e.  left1<=right2 && left2<=right1. If so we only care about these elements, else search for the appropriate elements. 
            int left1 = (part1 ==0)? Integer.MIN_VALUE : nums1[part1-1];
            int left2 = (part2 ==0)? Integer.MIN_VALUE : nums2[part2-1];
            int right1 = (part1 ==length1)? Integer.MAX_VALUE : nums1[part1];
            int right2 = (part2 == length2)? Integer.MAX_VALUE : nums2[part2];
  
            if(left1<=right2 && left2<=right1){
                return getamongFour(left1,left2,right1,right2,length1+length2);
            }else if(part1<high && left2>right1){
                low = part1+1;
            }else {
                high = part1-1;
            }            
        }
       return 0.0; 
    }
    
    
    public double getamongFour(int left1,int left2, int right1, int right2, int length){
        if(length%2==0){
            return (double)(Math.max(left1,left2) + Math.min(right1,right2))/2;
        }
        return (double)Math.max(left1,left2);
    }
    
}
