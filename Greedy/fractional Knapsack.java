//gfg

/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
      //Sort acc to value per weight
        Arrays.sort(arr,
        (a,b) -> (((double)a.value/(double)a.weight)>((double)b.value/(double)b.weight))?-1:
        (((double)a.value/(double)a.weight)<((double)b.value/(double)b.weight))?1:0);
      
        double value = 0;
        int currWeight = 0;
        
        for(int i = 0 ; i < n ; i++){
            if(arr[i].weight + currWeight <= W){ // add complete item
                currWeight+=arr[i].weight;
                value += arr[i].value;
            }
            else{//add fractional item
                double remainingWeight = (double)(W - currWeight) ;
                double itemValue = remainingWeight*((double)arr[i].value/(double)arr[i].weight);
                value+=itemValue;
                break;
            }
        }
        return value;
    }
}
