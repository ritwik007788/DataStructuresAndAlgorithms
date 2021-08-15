//leetcode 38

class Solution {
    public String countAndSay(int n) {
        String s = "1";//initialize the string using base condition
        for(int i = 1 ; i < n ; i++){
            s = solve(s);//call the helper function
        }
        return s;
    }
    
    //iterates through the string while keeping the count of characters
    public String solve(String s){
        char c = s.charAt(0);//choose the 1st char
        int count = 1;//count will always start from 1
        StringBuilder sb = new StringBuilder("");
        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) == c){
                count++;//when we have same chars adjacent to each other
            }
            else{
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);// choose the next char for further comparision
                count = 1;//initialize count for c
            }
        }
        
        sb.append(count);//add the count of the last char
        sb.append(c);
        return sb.toString();
    }
}
