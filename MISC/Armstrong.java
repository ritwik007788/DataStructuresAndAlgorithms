//gfg

class Solution {
    static String armstrongNumber(int n){
        // code here
        int num = n;
        int sum = 0;
        
        while(num>0){
            sum += Math.pow((num%10),3);
            num = num/10;
        }
        if(sum==n){
            return "Yes";
        }
        return "No";
    }
}
