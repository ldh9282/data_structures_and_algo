package arrays;

import java.util.Arrays;

public class ArraysTest03_build_array {
	private Object[] data;
	private int capacity;
	private int length;
	
	public ArraysTest03_build_array() {
		this.capacity = 1;
		this.length = 0;
		this.data = new Object[1];
	}
	
	// O(1)
	public Object get(int index) {
		return this.data[index];
	}
	
	// O(1), but it could be O(n) when the array needs to be resized
	public void push(Object item) {
		if (this.capacity == this.length) {
			this.data = Arrays.copyOf(data, capacity * 2); // O(n)
			this.capacity *= 2;
		}
		this.data[length] = item;
		this.length++;
	}
	
	// O(1)
	public Object pop() {
		Object popped = this.data[this.length-1];
		this.data[this.length-1] = null;
		this.length--;
		return popped;
	}
	
	// O(n)
	public void delete(int index) {
		for (int i = index; i < this.length-1; i++) {
			this.data[i] = data[i + 1];
		}
		this.data[this.length-1] = null;
		this.length--;
	}
	
	// O(n)
	public void insert(int index, Object item) {
		if (this.capacity == this.length) {
			this.data = Arrays.copyOf(data, capacity * 2); // O(n)
			this.capacity *= 2;
		}
		for (int i = this.length-1; i >= index ; i--) {	// O(n)
			this.data[i + 1] = data[i];
		}
		this.data[index] = item;
		this.length++;
	}
}
