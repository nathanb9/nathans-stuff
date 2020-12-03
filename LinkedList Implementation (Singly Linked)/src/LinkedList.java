import java.io.*; 


//Singly Linked List 
public class LinkedList { 

	Node head; 

	static class Node { 

		int data; 
		Node next; 

		 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
		
		Node new_node = new Node(data); 
		new_node.next = null; 

		
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			 
			last.next = new_node; 
		} 

		
		return list; 
	} 

	 public static int getLargest(LinkedList list) {		 
		 Node currNode = list.head; 
		 int largest = currNode.data;
		 while(currNode != null) {
			 if(currNode.data > largest) {
				 largest = currNode.data;
			 }
			 currNode = currNode.next;
		 }
		 return largest;
	 }
	public static void printList(LinkedList list) 
	{ 
		Node currNode = list.head; 
	 
		while (currNode != null) { 
			
			System.out.print("["+currNode.data + "]"); 
			currNode = currNode.next; 
		} 
	} 
}