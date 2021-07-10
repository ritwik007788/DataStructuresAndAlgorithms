//Leetcode #3

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        int i = 0;
        int j = 0;
        int max = 0;
        
        while(j<s.length()){
            
            char c = s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            
            if(map.size()==j-i+1){ // size of map(i.e no of elements) must be equal to window size for a substring without repeating characters(or all distinct elements)
                max = Math.max(max,j-i+1);
                j++;
            }
            
            else if(map.size()<j-i+1){ // this means elements are repeating
                // we remove elements from the left side
                while(map.size()<j-i+1){
                    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                    if(map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));// if an element doesn't exist in the substring we remove it from the map
                    }
                    i++;
                }
                j++;
            }
            
        }
        return max;
    }
}
