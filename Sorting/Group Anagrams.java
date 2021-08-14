//Leetcode 49

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        
        for(String curr : strs){
            
            char[] arr = new char[26];
            
            for(char c : curr.toCharArray()){
                arr[c-'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            
            for(int i = 0 ; i < arr.length ; i++){
                sb.append("#");
                sb.append(arr[i]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)) map.put(key,new ArrayList<String>());
            map.get(key).add(curr);
        }
        return new ArrayList(map.values());
    }
}
