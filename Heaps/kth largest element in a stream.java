//gfg
class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {
        // code here
        int[] res = new int[n];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0 ; i < res.length ; i++){
            if(minHeap.size()<k){
                minHeap.add(arr[i]);
            }
            else{
                // if element is larger than top then only kth largest 
                // element will change. Otherwise we dont add the element only 
                // we need to keep only k elements in the minHeap
                if(arr[i]>minHeap.peek()){
                    minHeap.add(arr[i]);
                    minHeap.poll();
                }
            }
            
            if(minHeap.size()>=k){
                res[i] = minHeap.peek();
            }
            else{
                res[i] = -1;
            }
        }
        return res;
    }
}
