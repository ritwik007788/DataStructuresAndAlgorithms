//gfg
class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       int mcl[] = new int[n]; // store the maxlength of every pair
       Arrays.fill(mcl,1);//initial max length is 1 for each pair
       
       Arrays.sort(arr , (a,b) -> a.x<b.x?-1:a.x>b.x?1:0);
       
       for(int i = 1 ; i < n ; i++){
           for(int j = 0 ; j < i ; j++){
               if(arr[i].x > arr[j].y){
                   mcl[i] = Math.max(mcl[j]+1,mcl[i]);
               }
           }
       }
       int max = Integer.MIN_VALUE;
       for(int i = 0 ; i < n ; i++){
           max = Math.max(max,mcl[i]);
       }
       return max;
    }
}
