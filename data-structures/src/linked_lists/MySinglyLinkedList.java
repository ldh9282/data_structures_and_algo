package linked_lists;

public class MySinglyLinkedList {
	private MySinglyLinkedNode head;
	private MySinglyLinkedNode tail;
	private int length;

	public MySinglyLinkedList(Object value) {
		head = new MySinglyLinkedNode(value);
		tail = head;
		length = 1;
	}

	// O(1)
	public void prepend(Object value) {
		head = new MySinglyLinkedNode(value, head);
		length++;
	}

	// O(1)
	public void append(Object value) {
		MySinglyLinkedNode newNode = new MySinglyLinkedNode(value);
		tail.setNext(newNode);
		tail = newNode;
		length++;
	}


	// O(n)
	public MySinglyLinkedNode traverseToIndex(int index) {
		MySinglyLinkedNode currentNode = head;
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

		MySinglyLinkedNode leader = traverseToIndex(index - 1); // O(n)
		MySinglyLinkedNode nextNode = leader.getNext();
		MySinglyLinkedNode newNode = new MySinglyLinkedNode(value, nextNode);
		leader.setNext(newNode);
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
			MySinglyLinkedNode leader = traverseToIndex(length -2);
			leader.setNext(null);
			tail = leader;
			length--;
			return;
		}

		MySinglyLinkedNode leader = traverseToIndex(index - 1);
		MySinglyLinkedNode nodeToRemove = leader.getNext();
		leader.setNext(nodeToRemove.getNext());
		length--;
	}

	// O(n)
	public Object get(int index) {
		MySinglyLinkedNode currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getValue();
	}

	public void printList() {
		if (head == null) {
			return;
		}
		MySinglyLinkedNode currentNode = head;
		System.out.print(currentNode.getValue());
		currentNode = currentNode.getNext();
		while (currentNode != null) {
			System.out.print("-->" + currentNode.getValue());
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

	public void reverse() {
		MySinglyLinkedNode first = head;
		MySinglyLinkedNode second = first.getNext();
		
		tail = head;
		tail.setNext(null);
		
		for (int i = 0; i < length - 1; i++) {
			MySinglyLinkedNode temp = second.getNext();
			second.setNext(first);
			first = second;
			second = temp;
		}
		head = first;
	}


	public MySinglyLinkedNode getHead() {
		return head;
	}

	public MySinglyLinkedNode getTail() {
		return tail;
	}

	public int length() {
		return length;
	}

}
