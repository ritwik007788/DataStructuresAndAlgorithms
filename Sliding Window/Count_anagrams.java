// gfg

class Solution {

    int search(String pat, String txt) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        char[] pat_arr = pat.toCharArray();
        
        for(int i = 0 ; i < pat_arr.length ; i++){
            int val = map.getOrDefault(pat_arr[i],0);
            map.put(pat_arr[i],val+1);
        }
        int ans = 0;
        int i = 0;
        int j = 0;
        int count = map.size();
        int k = pat.length();
        char[] arr = txt.toCharArray();
        
        while(j<arr.length){
            if(map.containsKey(arr[j])){
                int val = map.get(arr[j]);
                val--;
                map.put(arr[j],val);
                
                if(val==0){
                    count--;
                }
            }
            
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(count == 0){
                    ans++;
                    
                }
                // sliding 
                
                if(map.containsKey(arr[i])){
                    int val_i = map.get(arr[i]);
                    val_i++;
                    map.put(arr[i],val_i);
                    if(val_i==1){
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
