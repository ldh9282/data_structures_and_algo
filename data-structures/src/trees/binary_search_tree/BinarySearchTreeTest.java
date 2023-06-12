package trees.binary_search_tree;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		binarySearchTree.insert(41);
		binarySearchTree.insert(20);
		binarySearchTree.insert(65);
		binarySearchTree.insert(11);
		binarySearchTree.insert(29);
		binarySearchTree.insert(32);
		binarySearchTree.insert(50);
		binarySearchTree.insert(91);
		binarySearchTree.insert(72);
		binarySearchTree.insert(99);
		
		binarySearchTree.printTree();
		
		System.out.println();
		System.out.println();
		
		binarySearchTree.remove(91);
		binarySearchTree.printTree();
		
		System.out.println(binarySearchTree.lookup(20).getValue());
		System.out.println(binarySearchTree.lookup(20).getLeft().getValue());
		System.out.println(binarySearchTree.lookup(20).getRight().getValue());
		

	}

}
