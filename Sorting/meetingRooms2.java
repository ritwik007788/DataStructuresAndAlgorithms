//Leetcode #253

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        //Separate out the start times and the end times in their separate arrays.
        int start[] = new int[intervals.length];
        int end[] = new int[intervals.length];
        
        for(int i = 0 ; i < intervals.length ; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        
        // Sort the start and end arrays.
        Arrays.sort(start);
        Arrays.sort(end);
        
        // the two pointers to be used in this sum
        int st_ptr = 0 ;
        int end_ptr = 0 ;
        
        //room count
        int roomsUsed = 0;
        
        // iterate over the meetings
        while(st_ptr<intervals.length){
            //first we check when a new meeting starts has the previous meeting ended
            if(start[st_ptr]<end[end_ptr]){//previous meeting hasn't ended
                roomsUsed++;
            }
            
            else{ // some previous meeting has ended and the room can be reused
                end_ptr++;
            }
            
            st_ptr++;
        }
        
        return roomsUsed;
        
    }
}
