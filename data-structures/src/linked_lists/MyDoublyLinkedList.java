package linked_lists;

public class MyDoublyLinkedList {
	private MyDoublyLinkedNode head;
	private MyDoublyLinkedNode tail;
	private int length;

	public MyDoublyLinkedList(Object value) {
		head = new MyDoublyLinkedNode(value);
		tail = head;
		length = 1;
	}

	// O(1)
	public void prepend(Object value) {
		MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value, null, head);
		head.setPrevious(newNode);
		head = newNode;
		length++;
	}

	// O(1)
	public void append(Object value) {
		MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value, tail, null);
		tail.setNext(newNode);
		tail = newNode;
		length++;
	}


	// O(n)
	public MyDoublyLinkedNode traverseToIndex(int index) {
		MyDoublyLinkedNode currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}

		return currentNode;
	}

	// O(n)
	public void insert(int index, Object value) {
		// validate an index

		if (index == 0) {
			prepend(value);
			return;
		}

		if (index == length) {
			append(value);
			return;
		}

		MyDoublyLinkedNode leader = traverseToIndex(index - 1); // O(n)
		MyDoublyLinkedNode nextNode = leader.getNext();
		MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value, leader, nextNode);
		leader.setNext(newNode);
		nextNode.setPrevious(newNode);
		length++;
	}	

	// O(n)
	public void remove(int index) {
		if (index == 0) {
			head = head.getNext();
			length--;
			return;
		}

		if (index == (length - 1)) {
			MyDoublyLinkedNode leader = traverseToIndex(length -2);
			leader.setNext(null);
			tail = leader;
			length--;
			return;
		}

		MyDoublyLinkedNode leader = traverseToIndex(index - 1);
		MyDoublyLinkedNode nodeToRemove = leader.getNext();
		leader.setNext(nodeToRemove.getNext());
		nodeToRemove.getNext().setPrevious(leader);
		length--;
	}

	// O(n)
	public Object get(int index) {
		MyDoublyLinkedNode currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getValue();
	}

	public void printList() {
		if (head == null) {
			return;
		}
		MyDoublyLinkedNode currentNode = head;
		System.out.print(currentNode.getValue());
		currentNode = currentNode.getNext();
		while (currentNode != null) {
			System.out.print("-->" + currentNode.getValue());
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

	public void reverse() {
		MyDoublyLinkedNode first = head;
		MyDoublyLinkedNode second = first.getNext();
		
		tail = head;
		tail.setNext(null);
		
		for (int i = 0; i < length - 1; i++) {
			MyDoublyLinkedNode temp = second.getNext();
			second.setNext(first);
			first = second;
			second = temp;
		}
		head = first;
	}
	

	public MyDoublyLinkedNode getHead() {
		return head;
	}

	public MyDoublyLinkedNode getTail() {
		return tail;
	}

	public int length() {
		return length;
	}
	
	
}
