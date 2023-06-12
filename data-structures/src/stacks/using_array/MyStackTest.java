package stacks.using_array;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(5);
		stack.push(20);
		stack.push(30);
		stack.printStack();
		stack.pop();
		stack.printStack();
		System.out.println(stack.peek());
		stack.printStack();
		stack.pop();
		stack.printStack();
	}
}
