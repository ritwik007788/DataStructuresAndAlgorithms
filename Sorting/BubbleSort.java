package Sorting;

public class BubbleSort {
	public static void main(String arg[]) {
		int[] arr = {22,11,33,44,77,55,44};
		int counter = 1;
		int n = arr.length;
		while(counter<n-1)
		{
			for(int i = 0 ;  i < n - counter ; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
			
			counter++;
		}
		
		for(int j = 0 ; j< n ; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
