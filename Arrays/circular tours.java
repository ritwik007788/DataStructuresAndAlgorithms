//gfg

class Solution
{
// Initially start at pump=0 and keeping visiting till wherever it is possible ,
// Suppose say you could reach pump=x-1 and you are unable to reach pump=x then our
// starting position cannot be anything between 0 and x-1 . So the next possible starting position is x.
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	int start = 0;
	int deficit  = 0;
	int balance = 0;
	
	for(int i = 0 ; i < petrol.length ;i++){
	    balance += petrol[i] - distance[i];
	    
	    if(balance<0){
	     start = i+1;
	     deficit += balance;// keep count of all previous deficit
	     balance = 0;
	    }
	 }
	 return (balance+deficit>=0)?start:-1; // this deals with the case when the total amount of petrol available in not enough for the total distance.
    }
}
