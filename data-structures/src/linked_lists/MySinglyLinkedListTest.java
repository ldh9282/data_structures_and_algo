package linked_lists;

public class MySinglyLinkedListTest {

	public static void main(String[] args) {

		MySinglyLinkedList list = new MySinglyLinkedList(10);
		list.append(2);
		list.append(4);
		list.printList();
		list.prepend(1);
		list.printList();
		list.insert(0, -1);
		list.printList();
		list.insert(list.length(), 6);
		list.printList();
		list.insert(list.length()-1, 9);
		list.printList();
		list.remove(0);
		list.printList();
		System.out.println("-----------------");
		list.reverse();
		list.printList();
		
		
//		list.remove(list.length() - 1);
//		list.printList();
//		list.remove(2);
//		list.printList();
//		
//		System.out.println(list.get(1));
//		System.out.println(list.get(list.length()-1));
	}


}
