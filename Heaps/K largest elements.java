//gfg

class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int nums[], int n, int k)
    {
        // code here 
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        
        for(int i = 0 ; i < n ; i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k)
                minHeap.poll();
        }

        ArrayList<Integer> list = new ArrayList<>();
        while(minHeap.size()>0){
            list.add(minHeap.peek());
            minHeap.poll();
        }
        Collections.reverse(list);
        return list;
    }
    
}
