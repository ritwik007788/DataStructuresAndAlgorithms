//gfg
// sort a k sorted array

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int x = 0 ; x<T ; x++){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int arr[] = new int[n];
		    for(int i = 0 ; i < n ; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		    
		    for(int i = 0 ; i < n ; i++){
		        minHeap.add(arr[i]);
		        
		        if(minHeap.size()>k){ // basically we maintain a window of size k+1
		            arr[i-k] = minHeap.peek();//adding the smallest element to the start of the window
		            minHeap.poll();
		        }
		    }
		    int i = n - k;
		    while(minHeap.size()>0){
		        arr[i++] = minHeap.peek();
		        minHeap.poll();
		    }
		    
		    for(i = 0 ; i < n ; i++){
		        System.out.print(arr[i]+" ");
		    }
		   System.out.println("");
		}
		
	}
}
