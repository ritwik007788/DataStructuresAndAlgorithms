//gfg

class Solution {
    
    static int ans;
    static int safePos(int n, int k) {
        // code here
        ans = 0 ;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            list.add(i);
        }
        
        solve(list,k-1,0);// reduce k by 1 always. do dry run to understand
        return ans;
    }
    
    static void solve(ArrayList<Integer> list, int k , int index ){
        //Base case
        if(list.size()==1){
            ans = list.get(0);
            return;
        }
        
        index = (index+k)%list.size();
        list.remove(index);
        
        solve(list,k,index);
        
    }
};
