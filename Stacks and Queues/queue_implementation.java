public class Queue {
	
	int front;
	int rear;
	int capacity;
	int queue[];
	
	Queue(int capacity){
		this.capacity = capacity;
		this.rear = 0;
		this.front = 0;// always remains zero
		queue = new int[capacity];
	}
	
	public void enqueue(int x) {
		if(rear < capacity) {
			queue[rear++] = x;
			return;
		}
		else {
			System.out.println("Overflow !!!");
			return;
		}
	}
	
	public int dequeue() {
		
		if(front == rear) {
			System.out.println("Queue is empty !!!");
			return 0;
		}
		
		int ele = queue[front];
		for(int i = front ; i < rear ; i++) {
			queue[i] = queue[i+1];
		}
		rear--;
		return ele;
	}
	
	public void printQueue() {
		if(front == rear) {
			System.out.println("Queue is empty !!!");
		}
		else {
			for(int i = 0 ; i <= rear-1 ; i++) {
				System.out.print(queue[i] + " ");
			}
		}
		System.out.println("");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue(4);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		q.printQueue();
		
	}

}
