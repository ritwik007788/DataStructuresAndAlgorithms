//ceil is the smallest number greater than the element

class Solution{
    
    
    static int findFloor(long arr[], int n, long x)
    {
        int start = 0;
        int end = n-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == x) return mid;//element is a ceil of itself
            
            if(arr[mid]>x){
              ans = mid;//possible candidate
              end = mid - 1;
            }
            
            else{
                start = mid + 1;
                
            } 
        }
        
        return ans;
    }
    
}
