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
    public void Add(int data) {
        Node new_node = new Node(data);
        count++;

        if (head == null) {
            head = new_node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
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

    //Function to Reverse the Linked List
    public Node ReverseList(Node head) {
        Node temp = head;
        Node curr = head;
        Node prev = null;
        while (temp != null) {
            temp = temp.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        head = prev;
        return head;

    }
}

public class ReversedLinkedList {

    public static void main(String[] args) {
        System.out.println("Hello World");
        LinkedList list = new LinkedList();
        list.Add(12);
        list.Add(13);
        list.Add(14);
        list.Add(15);
        list.Add(16);
        list.Add(17);
        list.Add(18);
        System.out.println("Original LinkedList - ");
        list.Print();
        list.head = list.ReverseList(list.head);
        System.out.println("\nReversed LinkedList - ");
        list.Print();
    }
}
