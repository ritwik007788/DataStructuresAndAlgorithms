// gfg

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        int currsum  = 0;
        int maxlen = 0;
        for(int i = 0 ; i < N ; i++){
            
            currsum += A[i];
            
            if(currsum  ==  K){
                maxlen = i+1;
            }
            
            if(!map.containsKey(currsum)){
                map.put(currsum, i );
            }
            
            if(map.containsKey(currsum-K)){
                maxlen = Math.max(maxlen , i - map.get(currsum-K));
            }
          
        }
        
        return maxlen;
    }
    
    
}
