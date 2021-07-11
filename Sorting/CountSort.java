public class countSort {

	public static void main(String[] args) {
		//input array
		int arr[] = {1,3,2,3,4,1,6,4,3};
		
		// find the max in arr
		
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			max = Math.max(arr[i], max);
		}
		
		// create a hash table to store the count
		int count[] = new int[max+1]; // we need to make an array where we have index till max element
									// index is basically the key of the hash table
		
		for(int i = 0 ; i < arr.length ; i++) {
			count[arr[i]]++;
		}

		
		// create a cummulative sum hash table
		
		for(int i  = 1 ; i < count.length ; i++) { // each key contains the no. of elements before itself including self
			count[i]=count[i]+count[i-1];
		}
		

		

		int output[] = new int[arr.length];
		int n = arr.length;
		
		for(int i = n-1 ; i >=0 ; i--) {
			
			count[arr[i]]--; // find the index by reducing count by 1 and also update count array
			int idx = count[arr[i]];
			output[idx] = arr[i];

		}
		
		for(int i = 0 ; i <output.length ; i++) {
			System.out.print(output[i]+" ");
		}
		

	}

}
