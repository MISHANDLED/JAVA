class LinkedList {

	int count = 0;
	Node head = null;

	//Node Class
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//Function to Add Node at Last
	public void AddBack(int data) {
		Node new_node = new Node(data);
		count++;

		if (head == null) {
			head = new_node;
		}

		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}

	//Function to Add Node at Beginning
	public void AddFront(int data) {
		Node new_node = new Node(data);
		count++;

		if (head == null) {
			head = new_node;
		}

		else {
			new_node.next = head;
			head = new_node;
		}

	}

	//Function to Add Node at a given position 
	//Indexing starts from Zero
	public void AddMiddle(int data, int position) {

		if (head == null) {
			if (position != 0) {
				return;
			}

			else {
				Node new_node = new Node(data);
				count++;
				head = new_node;
			}
		}

		else {

			if (position == 0) {
				AddFront(data);
			}

			else {
				Node newer_node = new Node(data);
				count++;
				Node new_node = head;
				while (count < position - 1) {
					new_node = new_node.next;
					count++;
				}

				Node temp = new_node.next;
				new_node.next = newer_node;
				newer_node.next = temp;
			}

		}
	}

	//Function to Delete Node at a given Postion
	//Indexing starts from Zero
	void DeleteNode(int position) {
		if (head == null) return;

		if (position > count || position < 0) return;

		Node temp = head;

		if (position == 0) {
			head = temp.next;
			count--;
			return;
		}

		for (int i = 0; i < position - 1; i++)
		temp = temp.next;

		Node next = temp.next.next;
		temp.next = next;
		count--;
	}

	//Function to Print Linked List
	public void Print() {

		Node new_node = head;
		while (new_node != null) {
			System.out.print(new_node.data + " ");
			new_node = new_node.next;
		}

		System.out.println();

	}

	// Function to Print Linked List in reverse
	public void ReversePrint(Node head) {

		if (head == null) return;

		ReversePrint(head.next);
		System.out.print(head.data + " ");
	}
}

public class LinkedListImplementation {

	public static void main(String[] args) {
		System.out.println("Hello World");
		LinkedList list = new LinkedList();
		list.AddBack(12);
		list.AddBack(13);
		list.AddBack(14);

		list.AddFront(15);
		list.AddFront(16);
		list.AddFront(17);

		list.AddMiddle(18, 0);
		list.DeleteNode(1);

		System.out.print("Linked List - ");
		list.Print();

		System.out.print("Reversed Linked List - ");
		list.ReversePrint(list.head);
	}
}
