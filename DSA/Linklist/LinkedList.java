import java.io.*; 
import java.util.Scanner;

public class LinkedList { 

	Node head; 
	static class Node { 

		int data; 
		Node next; 

		// Constructor 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	public static LinkedList insert(LinkedList list, int data) 
	{ 
		Node new_node = new Node(data); 
		
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			// Else traverse till the last node and insert the new_node there 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			// Insert the new_node at last node 
			last.next = new_node; 
		} 

		// Return the list by head 
		return list; 
	} 

	public static LinkedList deletelast(LinkedList list) 
	{ 
		
		if (list.head == null) { 
			System.out.println("List is empty !");
		} 
		else { 
			// Else traverse till the last node and insert the new_node there 
			Node last = list.head; 
			while (last.next.next != null) { 
				last = last.next; 
			} 
			last.next = null; 
		} 

		// Return the list by head 
		return list; 
	} 

	// Method to print the LinkedList. 
	public static void printList(LinkedList list) 
	{ 
		Node currNode = list.head; 
		System.out.print("LinkedList: "); 
	
		// Traverse through the LinkedList 
		while (currNode != null) { 
			// Print the data at current node 
			System.out.print("\t"+currNode.data + "->" +currNode.next); 
	
			// Go to next node 
			currNode = currNode.next; 
		} 
	} 
	
	// Driver code 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedList list = new LinkedList(); 

		// ******INSERTION****** 
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range ");
		int n = scanner.nextInt();
		while(i<n){
			int data = ++i;
			list = insert(list, data); 
		}
		printList(list);
	} 
}

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class LinkedList {
//     Node head;
//     Node tail;

//     LinkedList() {
//         this.head = null;
//         this.tail = null;
//     }

//     void insert(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = tail = newNode;
//         } else {
//             tail.next = newNode;
//             tail = newNode;
//         }
//     }

//     void insertf(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = tail = newNode;
//         } else {
//             newNode.next = head;
//             head = newNode;
//         }
//     }


//     void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         // Insert values from 1 to 10 into the linked list
//             list.insert(5);
//             list.insert(6);
//             list.insert(7);
//             list.insertf(4);
        

//         // Display the linked list
//         System.out.print("Linked List: ");
//         list.display();
//     }
// }