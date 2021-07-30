//gfg

class Solution
{
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    //Function to insert heap.
    public  void insertHeap(int x)
    {
        // add your code here
        if(maxHeap.isEmpty() || maxHeap.peek()>=x){
            maxHeap.add(x);
        }
        else{
            minHeap.add(x);
        }
        balanceHeaps();
    }
    
    //Function to balance heaps.
    public  void balanceHeaps()
    {
       // add your code here
       if(maxHeap.size()>minHeap.size()+1){
           minHeap.add(maxHeap.poll());
       }
       else if(minHeap.size()>maxHeap.size()){
           maxHeap.add(minHeap.poll());
       }
    }
    
    //Function to return Median.
    public  double getMedian()
    {
        // add your code here
        if(maxHeap.size() == minHeap.size()){
            return (double)(maxHeap.peek()+minHeap.peek())/2.0;
        }
        return maxHeap.peek();
    }
}
