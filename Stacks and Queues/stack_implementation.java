public class Stack {
	int MAX = 4;
	int top = -1;
	int arr[] = new int[MAX];
	
//	Stack() {
//		top = -1;
//	}
	
	public boolean isEmpty() {
		if(top<0) return true;
		return false;
	}
	
	public boolean push(int x) {
		if(top>=MAX-1) {
			System.out.println("Stack Overflow !!!");
			return false;
		}
		else {
			arr[++top] = x;
			return true;
		}
	}
	
	public int pop() {
		if(top<0) {
			System.out.println("Stack Underflow !!!");
			return 0;
		}
		else {
			int x = arr[top--];
			return x;
		}
	}
	
	public int peek() {
		if(top<0) {
			System.out.println("Stack Underflow !!!");
			return 0;
		}
		else {
			int x = arr[top];
			return x;
		}
		
	}
	
	public void printStack() {
		int i = 0;
		for(;i <= top ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.printStack();
		st.push(5);
		st.printStack();
		System.out.println(st.peek());
		st.pop();
		st.printStack();

	}

}
