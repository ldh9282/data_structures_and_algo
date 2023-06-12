package linked_lists;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		
		MySinglyLinkedList list = new MySinglyLinkedList(5);
		list.printList();
		list.append(8);
		list.append(10);
		list.printList();
		list.insert(0, 2);
		list.printList();
		list.insert(list.length(), 4);
		list.printList();
		list.insert(2, 6);
		list.printList();
		System.out.println("-----------");
		list.reverse();
		list.printList();
//		list.remove(0);
//		list.printList();
//		list.remove(list.length() - 1);
//		list.printList();
//		list.remove(2);
//		list.printList();
	}

}
