package trees.binary_search_tree;

import java.util.Iterator;

public class BinarySearchTree {

	public BinaryNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	
	// O of log n (Average)
	// O of n (Worst)
	public void insert(int value) {
		if (root == null) {
			
			root = new BinaryNode(value);
			return;
		}
		
		BinaryNode currentNode = root;
		
		while (true) {
			
			if (value < currentNode.getValue()) {
				
				if (currentNode.getLeft() == null) {
					currentNode.setLeft(new BinaryNode(value));
					return;
				}
				
				currentNode = currentNode.getLeft();
			} else {
				
				if (currentNode.getRight() == null) {
					currentNode.setRight(new BinaryNode(value));
					return;
				}
				
				currentNode = currentNode.getRight();
			}
		}
	}
	
	// O of log n (Average)
	// O of n (Worst)
	public void remove(int value) {
		if (root == null) {
			return;
		}
		
		BinaryNode parentNode = null;
		BinaryNode currentNode = root;
		
		while (currentNode != null) {
			
			if (value < currentNode.getValue()) {
				parentNode = currentNode;
				currentNode = currentNode.getLeft();
			} else if (value > currentNode.getValue()) {
				parentNode = currentNode;
				currentNode = currentNode.getRight();
			} else if (value == currentNode.getValue()){
				if (currentNode.getRight() == null) { // option 1 
					if (parentNode == null) {
						root = currentNode.getLeft();
					} else {
						if (currentNode.getValue() < parentNode.getValue()) {
							parentNode.setLeft(currentNode.getLeft());
						} else if (currentNode.getValue() > parentNode.getValue()) {
							parentNode.setRight(currentNode.getLeft());
						}
					}
				} else if (currentNode.getRight().getLeft() == null) { // option 2
					currentNode.getRight().setLeft(currentNode.getLeft());
					
					if (parentNode == null) {
						root = currentNode.getRight();
					} else {
						if (currentNode.getValue() < parentNode.getValue()) {
							parentNode.setLeft(currentNode.getRight());
						} else if (currentNode.getValue() > parentNode.getValue()) {
							parentNode.setRight(currentNode.getRight());
						}
					}
				} else {// currentNode.getRight().getLeft() != null ( option 3 )
					
					BinaryNode leftmost  = currentNode.getRight().getLeft();
					BinaryNode leftmostParent = currentNode.getRight();
					
					while (leftmost.getLeft() != null) {
						leftmostParent = leftmost;
						leftmost = leftmost.getLeft();
					}
					
					leftmostParent.setLeft(leftmost.getRight());
					leftmost.setLeft(currentNode.getLeft());
					leftmost.setRight(currentNode.getRight());
					
					if (parentNode == null) {
						root = leftmost;
					} else {
						if (currentNode.getValue() < parentNode.getValue()) {
							parentNode.setLeft(leftmost);
						} else if (currentNode.getValue() > parentNode.getValue()) {
							parentNode.setRight(leftmost);
						}
					}
				}
				
				return;
			}
		}

	}
	
	
	// O of log n (Average)
	// O of n (Worst)
	public BinaryNode lookup(int value) {
		if (root == null) {
			
			return null;
			
		}
		
		BinaryNode currentNode = root;
		
		while (currentNode != null) {
			
			if (value < currentNode.getValue()) {
				
				currentNode = currentNode.getLeft();
			} else if (value > currentNode.getValue()) {
				currentNode = currentNode.getRight();
			} else {
				return currentNode;
			}
		}
		
		return null;
	}
	

	
	
	
	private int count = 0;
	public void printTree() {
		count = 0;
		printTree(root);
	}

	private void printTree(BinaryNode node) {
		System.out.print(node.getValue());
		System.out.println();
		count++;
		if(node.getLeft() != null) {
			System.out.print(getTabRepeatedly(Math.max(0, count)) + "Left(" + count + " height): ");
			printTree(node.getLeft());
		}
		if(node.getRight() != null) {
			System.out.print(getTabRepeatedly(Math.max(0, count)) +"Right(" + count + " height): ");
			printTree(node.getRight());
		}
		count--;
	}

	private String getTabRepeatedly(int n) {
		String str = "";
		
		if (n == 0) {
			return str;
		}
		
		for (int i = 0; i < n; i++) {
			str += "\t";
		}
		
		return str;
	}


}
