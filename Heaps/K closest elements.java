//gfg


class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0 ; i < n ; i++){
            if(arr[i]==x)continue; // dont add the element itself
            maxHeap.add(new Pair(Math.abs(arr[i]-x),arr[i]));
            
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        
        while(maxHeap.size()>0){
            list.add(maxHeap.peek().value);
            maxHeap.poll();
        }
        Collections.reverse(list);
        int res[] = new int[k];
        for(int i = 0 ; i < k ; i++){
            res[i]=list.get(i);
        }
        
        return res;
    }
}

class Pair implements Comparable<Pair>{
    int diff;
    int value;
    
    Pair(int diff ,int value){
        this.diff = diff;
        this.value = value;
    }
    @Override
    public int compareTo(Pair o){
        if(this.diff != o.diff) // for different diff
            return this.diff - o.diff;
        else // if diff is same we prioritize the larger value
            return o.value-this.value;
    }
}
