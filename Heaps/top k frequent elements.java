//Leetcode 347

class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            int val = map.getOrDefault(nums[i],0);
            map.put(nums[i],val+1);
        }
        
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();
        
        
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            minHeap.add(new Pair(map.get(key),key));
            
            if(minHeap.size()>k){
                minHeap.poll();
            }
            
        }
        
        int ans[] = new int[k];
        int index = k-1;
        
        while(minHeap.size()>0){
            ans[index--] = minHeap.poll().value;
        }
        
        return ans;
        
    }
}

class Pair implements Comparable<Pair>{
    int value;
    int freq;
    Pair(int freq, int value){
        this.value = value;
        this.freq = freq;
    }

    public int compareTo(Pair o){
        if(this.freq != o.freq)
            return this.freq - o.freq;
        else
            return this.value- o.value; // If Frequncy equal Sort by value
    }
}
