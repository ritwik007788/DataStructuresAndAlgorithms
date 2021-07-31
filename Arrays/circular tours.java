//gfg

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
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
	     deficit += balance;
	     balance = 0;
	    }
	 }
	 return (balance+deficit>=0)?start:-1;
    }
}
