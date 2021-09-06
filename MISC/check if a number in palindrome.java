//gfg

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int revNum = rev(n);
        if(revNum == n) return "Yes";
        return "No";
        
    }
    
    public int rev(int num){
        int revNum = 0;
        while(num>0){
            revNum = revNum*10 + (num%10);
            num = num/10;
        }
        return revNum;
    }
}
