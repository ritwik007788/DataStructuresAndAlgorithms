package Sorting;

public class Selection {

	public static void main(String[] args) {

		SelectionSorting ob = new SelectionSorting();
		int arr[] = {2,5,4,1,3};
		ob.sort(arr);
		ob.printArray(arr);

	}

}

class SelectionSorting{
	void sort(int arr[]) {
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			int min_index = i ;
			for(int j = i+1 ; j<n ; j++) {
				if(arr[j]<arr[min_index])
					min_index = j ;
			}
			
			int temp = arr[i];
			arr[i]= arr[min_index];
			arr[min_index] = temp;
		}
	}
	
	void printArray(int arr[]) {
		for(int i = 0 ; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
