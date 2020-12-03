
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 

		// 
		// ******INSERTION****** 
		// 

		// Insert the values 
		list = LinkedList.insert(list, 1); 
		list = LinkedList.insert(list, 2); 
		list = LinkedList.insert(list, 3); 
		list = LinkedList.insert(list, 4); 
		list = LinkedList.insert(list, 20); 
		list = LinkedList.insert(list, 6); 
		list = LinkedList.insert(list, 41); 
		list = LinkedList.insert(list, 8); 
		System.out.println(LinkedList.getLargest(list));
		// Print the LinkedList 
		LinkedList.printList(list); 

	}

}
