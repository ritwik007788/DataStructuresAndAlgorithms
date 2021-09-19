//nth term in fibonacci series

public static int fib(int n) {
		if(n==0 ||n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

// printing the fibonacci series

public static void fibseq(int n) {
		int a = 0 ;
		int b = 1;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=2; i < n ; i++) {
			int temp = a+b;
			System.out.print(temp+" ");
			a=b;
			b = temp;
		}
	}
