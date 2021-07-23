//gfg

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int i = 0 ; i < n ; i++){
            int ele = k - arr[i];
            map.put(arr[i],map.get(arr[i])-1);
            if(map.containsKey(ele) && map.get(ele)>0){
                count=count + map.get(ele);
            }
            
        }
        return count;
    }
}
