package queues.using_stacks;

import java.util.Stack;

public class MyQueue {
	Stack<Object> stack  = new Stack();
	Stack<Object> auxiliaryStack  = new Stack();

	public void enqueue(Object value) {
		stack.push(value);
	}

	// Removes the element from in front of queue.
	public Object dequeue() {
		fillAuxiliaryStackWithStack();
		Object value = auxiliaryStack.pop();
		fillStackWithAuxiliaryStack();

		return value;
	}

	// Get the front element.
	public Object peek() {
		fillAuxiliaryStackWithStack();
		Object value = auxiliaryStack.peek();
		fillStackWithAuxiliaryStack();

		return value;
	}


	private void fillAuxiliaryStackWithStack() {
		while (!stack.isEmpty()) { 
			auxiliaryStack.push(stack.pop());
		}
	}

	private void fillStackWithAuxiliaryStack() {
		while (!auxiliaryStack.isEmpty()) { 
			stack.push(auxiliaryStack.pop());
		}
	}


	public void printQueue() {
		if (stack.empty()) {
			return;
		}

		fillAuxiliaryStackWithStack();
		
		Object[] list = auxiliaryStack.toArray();
		System.out.print("auxiliaryStack's top-->");
		for (Object o : list) {
			System.out.print(o + "-->");
		}
		System.out.println("auxiliaryStack's bottom");
		
		fillStackWithAuxiliaryStack();
	}
}
