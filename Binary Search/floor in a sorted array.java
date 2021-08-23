//gfg

// floor of an element is the greatest number smaller than that element
class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int start = 0;
        int end = n-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == x) return mid;//element is a floor of itself
            
            if(arr[mid]>x) end = mid - 1;
            
            else{
                ans = mid;//possible candidate
                start = mid + 1;
                
            } 
        }
        
        return ans;
    }
    
}
