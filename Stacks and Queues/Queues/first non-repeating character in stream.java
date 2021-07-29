//gfg

public class Solution {
    public String solve(String A) {
        StringBuffer sb = new StringBuffer();
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];//create a hashtable to store freq
        Arrays.fill(freq,0);

        for(int i = 0 ; i < A.length() ; i++){
            freq[A.charAt(i)-'a']++;
            q.add(A.charAt(i));

            while(!q.isEmpty() && freq[q.peek()-'a']>1){ // if freq is more than 1 then remove the elements
                q.remove();
            }

            if(q.isEmpty())sb.append('#');// no non-repeating element
            else sb.append(q.peek());
        }

        return sb.toString();

    }
}
