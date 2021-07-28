//gfg

class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> st = new Stack<>();// stack stores the possible celebrity
    	
    	for(int i = 0 ; i < n ; i++){//add everyone first
    	    st.push(i);
    	}
    	if(st.empty()) return -1; // edge case(no people)
    	
    	while(st.size()>1){ //since we pop 2 elements we need size to greater than 1
    	    int a = st.pop();
    	    int b = st.pop();
    	    
    	    if(knows(a,b,M)){
    	        st.push(b);//if a knows b then b MIGHT be a celebrity
    	    }
    	    else{
    	        st.push(a);// if a doesn't know b then a MIGHT be a celebrity
    	    }
    	}
    	// After this loop we will always be left with one person (-2+1=-1)
    	int c = st.pop();
    	// now we check if the last person is a celebrity
    	for(int i = 0 ; i < n ; i++){
    	    if(i!=c && (!knows(i,c,M) || knows(c,i,M))){
    	        return -1;
    	    }
    	}
    	
    	return c;
    	
    }
    
    boolean knows(int a , int b , int[][] M){
        // returns true if a knows b
        if(M[a][b] == 1) return true;
        
        return false;
    }
}
