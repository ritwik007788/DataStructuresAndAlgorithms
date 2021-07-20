//Leetcode 41

----------------------------------------------O(N) solution------------------------------------------------------

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
         // the missing no. lies in the range [1,n]
        // if all elements from 1 to n are present then the result would be n+1
        
        // first we deal with nos.<=0 and greater than n as they can't be our answer
        
        for(int i = 0 ; i < n ; i++){
            if(nums[i]<=0 || nums[i]>n){
                nums[i] = n+1;
            }
        }
        
        // now we traverse through the array
        //if we find a number in the range [1,n] we make its 0 based index negative to mark its presence
        // for instance if element at i=2 is -ve this means i+1 element exists in the array
        
        for(int i = 0 ; i < n ; i++){
            int num = Math.abs(nums[i]);//in the updated array few elements will be -ve
            if(num == n+1) continue; // if a no. is out of range , ignore it.
            
            num--; // finding the 0 based index
            if(nums[num]>0){ // check if nums[num] hasn't already been converted
                             // this is required when elements inside an array are repeated
                nums[num] = -1 * nums[num];
            }
            
        }
        
        // search for the 1st +ve no.
        //if found then i+1 is the missing number
        
        for(int i = 0 ;  i < n ; i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        
        // if all elements in the array are there then n+1 is the first missing number
        
        return n+1;        

    }
}

--------------------------------------------O(NlogN) solution------------------------------------------------------

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n)
    {
        // Your code here
        int ans = 1 ;
        Arrays.sort(arr);
        for(int i=0 ; i<n;i++){
            if(arr[i]==ans)ans++;
        }
        return ans;
    }
}
