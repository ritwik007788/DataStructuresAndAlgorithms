//gfg

class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<activity> list = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            list.add(new activity(start[i],end[i]));
        }
        
        Collections.sort(list,(a,b) -> a.e<b.e?-1:a.e>b.e?1:0);
        
        int timeLimit = list.get(0).e;
        int count = 1;
        
        for(int i = 1 ; i < n ; i++){
            if(list.get(i).s>timeLimit){
                count++;
                timeLimit = list.get(i).e;
            }
        }
        return count;
    }
    
}
class activity{
    int s;
    int e;
    
    activity(int s , int e){
        this.s = s;
        this.e = e;
    }
}
