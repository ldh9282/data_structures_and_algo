package queues.using_linked_list;

public class MyQueueTest {
	
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
	}
}
