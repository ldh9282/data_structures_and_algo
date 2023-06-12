package queues.using_linked_list;

public class MyQueue {
	private MySinglyLinkedNode first;
	private MySinglyLinkedNode last;
	private int length;

	public MyQueue() {
		first = null;
		last = null;
		length = 0;
	}

	public Object peek() {
		if (first == null) {
			return null;
		}

		return first.getValue();
	}

	public void enqueue(Object value) {
		MySinglyLinkedNode newNode = new MySinglyLinkedNode(value);
		if (length == 0) {
			first = newNode;
		} else {
			last.setNext(newNode);
		}

		last = newNode;
		length++;
	}

	public void dequeue() {
		if (first == null) {
			return;
		}

		first = first.getNext();
		length--;

		if (length == 0) {
			last = null;
		}
	}

	public void printQueue() {
		if(first == null) {
			return;
		}
		MySinglyLinkedNode currentNode = first;
		System.out.print(currentNode.getValue());
		currentNode = currentNode.getNext();
		while (currentNode != null) {
			System.out.print("-->" + currentNode.getValue());
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}
}
