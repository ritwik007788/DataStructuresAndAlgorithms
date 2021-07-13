//gfg

class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int l = 0;
	    int  r = n-1;
	    int bitonic_pt = -1;
	    
	    while(l<=r){
	        int mid = l + (r-l)/2;
	        
	        if(mid == 0  || mid == n-1){
	            bitonic_pt = mid;
	            break;
	        }
	        
	        else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
	            bitonic_pt = mid;
	            break;
	        }
	        
	        else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
	            l = mid+1;
	        }
	        
	        else{
	            r = mid - 1;
	        }
	    }
	    return arr[bitonic_pt] ;
    }
}
