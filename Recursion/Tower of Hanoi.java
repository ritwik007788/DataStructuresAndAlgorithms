public static void main(String[] args) {
		
		toh(3,1,3,2);// 1 is source tower , 2 is helper tower and 3 is destination tower
		
	}
	
	static void toh(int n , int source , int dest , int helper ) {//n is the no. of disks
		if(n==1) {
			System.out.println("Move disk 1 from "+ source +" to " + dest);
			return;
		}
		
		toh(n-1,source,helper,dest);// first move n-1 disks from source to helper
		
		System.out.println("Move disk "+ n + " from " +source+" to " + dest ); // then move the nth disk to the destination
		
		toh(n-1,helper,dest,source);// final move those n-1 disks to the destination
	}
