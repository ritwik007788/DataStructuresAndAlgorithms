//Leetcode 973

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<Pair>(Collections.reverseOrder());
        
        for(int[] i : points){
            maxHeap.add(new Pair(i[0]*i[0]+i[1]*i[1],i[0],i[1])); // instead of sqrt(x^2 + y^2) we are using (x^2 + y^2) as our distance
            
            while(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        int i = 0;
        int[][] res = new int[k][2];
        while(maxHeap.size()>0){
            res[i][0] = maxHeap.peek().x;
            res[i++][1] = maxHeap.peek().y;
            maxHeap.poll();
        }
        
        return res;
    }
}

class Pair implements Comparable<Pair>{
    int dist;
    int x;
    int y;
    Pair(int dist , int x , int y){
        this.dist = dist;
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair o)
    {
        return this.dist - o.dist; 
    }
}
