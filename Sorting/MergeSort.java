
class Solution
{
    void merge(int arr[], int l, int mid, int r)
    {
         // l -> starting of 1st array
         // mid -> ending of 1st array
         // r -> end of 2nd array
         
         int n1 = mid - l + 1; // window size
         int n2 = r - mid;
         
         int A[] = new int[n1];
         int B[] = new int[n2];
         
         for(int i = 0; i < n1 ; i++){
             A[i] = arr[l+i]; 
         }
         for(int j = 0;j<n2;j++){
             B[j] = arr[mid+1+j];
         }
         // now it is equivalent to merge two sorted arrays
         int x = 0;// pointer to 1st array 
         int j = 0; // pointer to 2nd array
         int k = l; // to update the main array
         while(x<n1 && j<n2){
             if(A[x]<=B[j]){
                 arr[k] = A[x];
                 x++;
                 k++;
             }
             else{
                 arr[k] = B[j];
                 k++;
                 j++;
             }
         }
         
         while(x<n1){
             arr[k]=A[x];
             k++;
             x++;
         }
         while(j<n2){
             arr[k]=B[j];
             k++;
             j++;
         }
         

     
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        int mid = l + (r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        merge(arr,l , mid , r);
    }
}
