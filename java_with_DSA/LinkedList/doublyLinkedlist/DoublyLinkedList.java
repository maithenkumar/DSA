package LinkedList.doublyLinkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        Node perv;

        Node(int val) {
            data = val;
            perv = null;
            next = null;

        }
    }

    DoublyLinkedList() {
        head = null;
        tail = null;

    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            tail = newNode;
            head = newNode;
        } else {
            newNode.perv = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertingAtBeginning(int val) {
        Node newNode = new Node(val);

        newNode.perv = null;
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head.perv = newNode;
            head = newNode;
        }

    }

    public void deleteAtBegin(int val){
        
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayReverse() {
        Node temp = tail;
        ;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.perv;
        }
        System.out.println("null");

    }
}