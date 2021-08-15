//gfg

class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> list = new ArrayList<String>();
        solve(S.length(),S,list,0);
        Collections.sort(list);
        return list;
    }
    public String swap(String str, int x, int y)
    {
        char arr[] = str.toCharArray();
        char tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;

        return new String(arr);
    }
    
    public void solve(int n , String s , List<String> list , int i){
        if(i==n-1){
            list.add(s);
            return;
        }
        
        for(int j = i ; j < n ; j++){
            s = swap(s,i,j);
            solve(n,s,list,i+1);
            s = swap(s,i,j);
        }
    }
}
