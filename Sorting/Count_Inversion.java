// gfg


class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.

    static long inversionCount(long arr[], long n)
    {
        // Your Code Here
        long res = mergeSort(arr,0,(int)(n-1));
        return res;
        
    }
    
    static long mergeSort(long arr[] , int low , int high ){
        long res = 0 ;
        if(low<high){
            int mid = low + (high-low)/2 ;
            res+=mergeSort(arr,low,mid);
            res+=mergeSort(arr,mid+1,high);
            res+=merge(arr,low ,mid , high);
        }
        return res;
    }
    
    static long merge(long arr[] , int low , int mid , int high){
        long res = 0 ;
        int n1 = mid-low + 1;
        int n2 = high - mid;
        
        long A[] = new long[n1];
        long B[] = new long[n2];
        
        for(int i = 0 ; i < n1 ; i++){
            A[i] = arr[low+i];
        }
        
        for(int j = 0 ; j < n2 ; j++){
            B[j] = arr[mid+1+j];
        }
        
        int k = low;
        int i = 0;
        int j = 0;
        
        while(i<n1 && j <n2){
            if(A[i]<=B[j]){
                arr[k++] = A[i++];
            }
            else{
                res+=n1-i;
                arr[k++] = B[j++];
            }
        }
        
        while(i<n1) arr[k++] = A[i++];
        while(j<n2) arr[k++] = B[j++];
        
        return res;
    }
}
