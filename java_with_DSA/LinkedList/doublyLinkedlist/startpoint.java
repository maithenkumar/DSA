package LinkedList.doublyLinkedlist;

public class startpoint {
    public static void main(String[] args) {
    DoublyLinkedList dl=new DoublyLinkedList();
        dl.insertingAtBeginning(1);
        dl.insertingAtBeginning(2);
        dl.insertingAtBeginning(3);
        dl.insertingAtBeginning(4);
        dl.insertingAtBeginning(5);
        dl.insertingAtBeginning(6);
        dl.insertAtEnd(0);
        dl.display();
        dl.displayReverse();
    }


    
}
