package LinkedList.circulerLinkedList;

public class StarterPont {
    public static void main(String[] args) {
        CirculerLinkedList<Integer> cl =new CirculerLinkedList<>();
        cl.insertingAtBeginning(1);
        cl.insertingAtBeginning(2);
        cl.insertingAtBeginning(3);
        cl.insertingAtBeginning(4);
        cl.insertingAtBeginning(5);
        cl.insertingAtBeginning(6);
        cl.insertingAtEnd(0);
        cl.insertingAtEnd(32);
        cl.insertingAtEnd(3);
        cl.deleteAtEnd();
        cl.deleteAtEnd();
        cl.deleteAtBegin();
        cl.deleteAtBegin();
        cl.deleteAtBegin();
        cl.deleteAtBegin();
        cl.deleteAtBegin();
        cl.deleteAtBegin();
        cl.deleteAtBegin();
        cl.deleteAtBegin();
        cl.deleteAtBegin();
        cl.deleteAtBegin();
        cl.deleteAtBegin();
        cl.display();
    }
    
}
