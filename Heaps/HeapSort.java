//gfg

class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i= (n/2)-1 ; i>=0 ;i--)// the last n/2 elements are leaves which
            heapify(arr,n,i);          // always satisfy the heap properties
    }
 
    //Heapify function to maintain heap property.
    // this function converts node i into heap and if swap is done it checks if 
    //lower elements still satify the heap properties
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        int largest = i;
        int l = (2*i)+1;
        int r = (2*i)+2;
        
        if(l<n && arr[l]>arr[largest]){
            largest = l;
        }
        
        if(r<n && arr[r]>arr[largest]){
            largest = r;
        }
        
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            heapify(arr,n,largest);
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr,n);// first we build the maxHeap
        for(int i = n-1 ; i>0 ; i--){
            //0th element is always largest in maxHeap 
            //hence we swap element 0 with last index of array
            
            int temp = arr[i];
            arr[i] = arr[0]; 
            arr[0] = temp;
            
            // now we call heapify on arr(excluding the last element)
            heapify(arr,i,0);
        }
    }
 }
