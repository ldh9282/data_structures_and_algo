package linked_lists;

public class MyDoublyLinkedNode {
	
	private Object value;
	private MyDoublyLinkedNode previous;
	private MyDoublyLinkedNode next;
	
	public MyDoublyLinkedNode(Object value) {
		this.value = value;
		this.next = null;
	}
	
	public MyDoublyLinkedNode(Object value, MyDoublyLinkedNode previous, MyDoublyLinkedNode next) {
		this.value = value;
		this.previous = previous;
		this.next = next;
	}

	public Object getValue() {
		return value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	
	public MyDoublyLinkedNode getPrevious() {
		return previous;
	}

	public void setPrevious(MyDoublyLinkedNode previous) {
		this.previous = previous;
	}

	public MyDoublyLinkedNode getNext() {
		return next;
	}
	
	public void setNext(MyDoublyLinkedNode next) {
		this.next = next;
	}
}
