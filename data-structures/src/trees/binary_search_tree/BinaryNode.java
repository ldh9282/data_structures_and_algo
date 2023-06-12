package trees.binary_search_tree;

public class BinaryNode {
	private int value;
	private BinaryNode left;
	private BinaryNode right;
	
	
	public BinaryNode(int value,
			BinaryNode left, BinaryNode right) {
		
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public BinaryNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public BinaryNode getLeft() {
		return this.left;
	}
	
	public void setLeft(BinaryNode left) {
		this.left = left;
	}

	public BinaryNode getRight() {
		return right;
	}

	public void setRight(BinaryNode right) {
		this.right = right;
	}
	
	public int getValue() {
		return this.value;
	}
}
