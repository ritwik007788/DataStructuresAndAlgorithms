//gfg

class Job{
  int profit;
  int deadline;
  
  Job(int profit,int deadline){
    this.profit = profit;
    this.deadline = deadline;
  }
}


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b) -> (b.profit - a.profit)); // sorting in decreasig order of profits
        int maxDeadline = Integer.MIN_VALUE;
        
      // we find the maximum time a person will wait to get the job done
        for(int i = 0 ; i < n ; i++){
            if(arr[i].deadline > maxDeadline){
                maxDeadline =  arr[i].deadline;
            }
        }
      //result array will be indicating if a slot is filled(arr[i]!=-1) or not(arr[i]==-1).
        int result[] =  new int[maxDeadline+1];// +1 is written to make the code understandable
        Arrays.fill(result,-1);//initialization of slots
      
        int countJobs = 0 ;
        int jobProfit = 0 ;
      
        for(int i = 0 ; i < n ; i++){
            int j = arr[i].deadline;// deadline of the job of concern
          
          // we now try to find if a slot is open on or before the deadline of the job of concern
            while(j>0){
                if(result[j]==-1){//empty slot found
                    result[j] = i ; // fill index(just make this slotnot equal to -1)
                    countJobs++;
                    jobProfit+=arr[i].profit;
                    break;
                }
                j--;// check for some previous slot
              
            }
        }
        
        return new int[]{countJobs,jobProfit};
        
    }
}
