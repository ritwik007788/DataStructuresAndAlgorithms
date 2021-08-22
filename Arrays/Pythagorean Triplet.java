//gfg

class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        for(int i = 0 ; i < n ; i++){
            arr[i] = (int)Math.pow(arr[i],2);
        }
        Arrays.sort(arr);
        
        for(int k = n-1 ; k>=0 ; k--){
            int l = 0 ;
            int r = k-1;
            
            while(l<r){
                if(arr[l]+arr[r]==arr[k]) return true;
                else if(arr[l]+arr[r]<arr[k])l++;
                else r--;
            }
        }
        return false;
    }
}
