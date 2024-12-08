package LinkedLists;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {

    Node head;
    // Insert at the beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);  // Step 1: Create a new node
        newNode.next = head;   // Step 2: Point the new node to the current head
        head = newNode;  // Step 3: Update head to the new node
    }
    // Display the list
    void displayList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print("null");
    }
}


public class InnerLinkedList {
    public static void main(String[]args){
        LinkedList list = new LinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(15);
        list.insertAtBeginning(20);
        list.insertAtBeginning(25);
        System.out.println("List ater Insertion at beginning : ");
        list.displayList();
    }
    
}