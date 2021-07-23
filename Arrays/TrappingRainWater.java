//Leetcode 42

class Solution {
    public int trap(int[] height) {
        int n =height.length;
        int l = 0 ;
        int r = n-1;
        int leftMax = 0;
        int rightMax = 0 ;
        int res  = 0;
        while(l<r){
            
            leftMax = Math.max(leftMax , height[l]);
            rightMax = Math.max(rightMax , height[r]);
            
            if(leftMax>rightMax){
                res += rightMax - height[r];
                r--;
            }
            else{
                res += leftMax - height[l];
                l++;
            }
        }
        return res;
    }
}
