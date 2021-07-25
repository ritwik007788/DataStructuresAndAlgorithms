//gfg

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<meeting> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(new meeting(start[i],end[i]));
        }
        Collections.sort(list,(a,b) -> a.e<b.e?-1:a.e>b.e?1:0);
        
        int timeLimit = list.get(0).e;
        
        int countMeetings = 1 ;
        
        for(int i = 1 ; i < n ; i++){
            if(list.get(i).s>timeLimit){
                countMeetings++;
                timeLimit = list.get(i).e;
            }
        }
        
        return countMeetings;
        
    }
    
}
class meeting{
    int s;
    int e;
    
    meeting(int s , int e){
        this.s = s;
        this.e = e;
    }
}
