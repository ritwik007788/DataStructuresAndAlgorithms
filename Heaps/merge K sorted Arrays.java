//gfg

class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length ; i++){
            minHeap.add(new Pair(arr[i][0],0,i));
        }
        
        while(minHeap.size()>0){
            list.add(minHeap.peek().val);
            int listIndex = minHeap.peek().li;
            int dataIndex = minHeap.peek().di;
            minHeap.poll();
            
            if(arr[listIndex].length>dataIndex+1){
                minHeap.add(new Pair(arr[listIndex][dataIndex+1],dataIndex+1,listIndex));

            }
        }
        return list;
        
    }
}
class Pair implements Comparable<Pair>{
    int val;
    int di;
    int li;
    
    Pair(int val , int di , int li){
        this.val = val;
        this.di = di;
        this.li = li;
    }
    
    public int compareTo(Pair o){
        return this.val - o.val;
    }
}
