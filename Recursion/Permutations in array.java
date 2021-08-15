//Leetcode 46

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        
        ArrayList<Integer> nums_lst = new ArrayList<Integer>();
        for (int num : nums)
          nums_lst.add(num);

        int n = nums.length;
        
        solve(n,nums_lst,output,0);
        
        return output;
    }
    
    public void solve(int n , ArrayList<Integer> nums , List<List<Integer>> output , int i){
        //base condition
        if(i == n){
            output.add(new ArrayList<>(nums));
        }
        
        for(int j = i ; j < n ; j++){
            
            Collections.swap(nums,i,j);
            solve(n,nums,output,i+1);
            Collections.swap(nums,i,j);
        }
        
    }
}
