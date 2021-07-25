//gfg

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int a = 0 , d = 0;
        int platforms = 0;
        for(; a < n ; a++){
            if(arr[a]<=dep[d]){
                platforms++;
            }
            else{
                d++;
            }
        }
        return platforms;
    }
    
}
