//gfg

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        int i  = 0;
        int j = 0;
        int maxlen = -1;
        while(j<s.length()){
            char c = s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            
            if(map.size()<k){
                j++;
            }
            else if(map.size()==k){
                maxlen = Math.max(maxlen,j-i+1);
                j++;
            }
            else if(map.size()>k){
                while(map.size()>k){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return maxlen;
    }
}
