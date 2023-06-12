package stacks.using_linked_list;

public class MyStack {
	private MySinglyLinkedNode top;
	private MySinglyLinkedNode bottom;
	private int length;

	public MyStack() {
		top = null;
		bottom = null;
		length = 0;
	}

	public Object peek() {
		if (top != null) {

			return top.getValue();
		}

		return null;
	}

	public Object pop() {
		if (top != null) {
			MySinglyLinkedNode tempTop = top;
			top = top.getNext();
			length--;
			if (length == 0) {
				bottom = null;
			}
			return tempTop.getValue();

		}

		return null;
	}

	public void push(Object value) {
		top = new MySinglyLinkedNode(value, top);
		if (length == 0) {
			bottom = top;
		}
		length++;
	}

	public void printStack() {
		if(top == null) {
			return;
		}
		MySinglyLinkedNode currentNode = top;
		System.out.print(currentNode.getValue());
		currentNode = currentNode.getNext();
		while (currentNode != null) {
			System.out.print("-->" + currentNode.getValue());
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}
}
