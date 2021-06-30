#GFG 

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int currsum = 0 , j = 0 ;
        int max = Integer.MIN_VALUE;
        while(j<arr.length){
            currsum+=arr[j];
            //if current element is bigger than everthing we added before then
            //its better to use the current element 
            if(currsum < arr[j]) currsum = arr[j];
            
            if(currsum > max) max = currsum;
            j++;
        }
        
        return max;
    }
