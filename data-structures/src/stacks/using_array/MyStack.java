package stacks.using_array;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private List<Object> array = null;
	
	public MyStack() {
		this.array = new ArrayList<>();
	}
	
	public Object peek() {
		if (array.size() == 0) {
			return null;
		}
		
		return array.get(array.size() - 1);
	}
	
	public Object pop() {
		if (array.size() == 0) {
			return null;
		}
		
		return array.remove(array.size() - 1);
	}
	
	public void push(Object value) {
		array.add(value);
	}
	
	public void printStack() {
		array.forEach((value) -> {
			System.out.print(value + "\t");
		});
		System.out.println();
	}
}
