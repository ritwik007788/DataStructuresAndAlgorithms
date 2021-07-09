//gfg

class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long ans[] = new long[N-K+1];
        int idx = 0;
        Queue<Long> q = new LinkedList<>();
        
        int i = 0;
        int j = 0;
        
        while(j<A.length){
            if(A[j]<0){
                q.add(A[j]);
            }
            
            if(j-i+1<K){
                j++;
            }
            else if(j-i+1 == K){
                
                if(!q.isEmpty()){
                    ans[idx] = q.peek();
                    idx++;
                    
                    if(q.peek() == A[i]){
                        q.remove();
                    }
                }
                
                else{
                    ans[idx] = 0;
                    idx++;
                }

                i++;
                j++;
                
            }
        }
        
        return ans;
    }
}
