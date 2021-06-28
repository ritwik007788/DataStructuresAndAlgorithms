package Sorting;

public class Insertion {
	public static void main(String args[]) {
		InsertionSort ob = new InsertionSort();
		int arr[] = {12, 11, 13, 5, 6 };
		ob.sort(arr);
		ob.printArray(arr);
	}

}

class InsertionSort{
	void sort(int arr[]) {
		for(int i = 1 ; i< arr.length;i++) { // we always start from the 2nd element
			int key = arr[i]; // storing the element to be comapared to the left subarray as key
			int j = i-1; // comparison starts from j
			while(j>=0 && arr[j]>key) { 
				arr[j+1]=arr[j]; // swapping
				j--; // checking left side
			}
			arr[j+1] = key; // finally putting key in the correct position
		}
	}
	
	void printArray(int arr[]) {
		for(int i = 0 ; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
