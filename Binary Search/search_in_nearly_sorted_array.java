// element whose correct position is N can be found in N-1 . N+1 , N

int bs(int arr[], int low, int high, int x)
{
	while(low <= high)
	{
		int mid = low + (high-low)/2;
		if(arr[mid] == x)
			return mid;
		if(mid > low && arr[mid-1] == x)//condition to avoid 0th index
			return mid-1;
		if(mid < high && arr[mid+1] == x)//condition to avoid (n-1)th index
			return mid+1;
		if(arr[mid] < x)
		{
			low = mid + 2;// we take 2 jumps
		}
		if(arr[mid] > x)
			high = mid - 2;
	}
	return -1;
}
