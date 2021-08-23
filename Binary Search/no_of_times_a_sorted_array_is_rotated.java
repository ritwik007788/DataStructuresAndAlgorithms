//gfg

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int l = 0;
        int r = n-1;
        int noOfRotations = 0;
        while(l<=r){
            int mid = l + (r-l)/2;
            int prev = (mid+n-1)%n;
            int next = (mid+n+1)%n;
            
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                noOfRotations = mid;
                return noOfRotations;
            }
            
            else if(arr[mid]>arr[n-1]) l= mid+1;
            else if(arr[mid] < arr[n-1]) r = mid-1;
            
        }
        return noOfRotations;
    }
}
