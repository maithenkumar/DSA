package LinkedList.circulerLinkedList;

public class CirculerLinkedList<T> {
    Node last;

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;

        }
    }

    CirculerLinkedList() {
        last = null;
    }
    public void deleteAtBegin(){
        Node temp=last.next;
        Node next=temp.next;
        last.next=next;

    }
    public void deleteAtEnd(){
        Node temp=last.next;
        Node perv=last;
        while(temp!=last){
            perv=temp;
            temp=temp.next;

        }
        perv.next=temp.next;
        last=perv;

    }
    
    public  void  insertingAtEnd(T val ){
        Node newNode=new Node(val);
         if (last == null) {
            newNode.next = newNode;
            last = newNode;

        } else {
            newNode.next = last.next;
           last.next=newNode;
            last=newNode;
           

        }

    }

    public void insertingAtBeginning(T val) {
        Node newNode = new Node(val);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;

        } else {

            newNode.next = last.next;
            last.next = newNode;

        }

    }

    public void display() {
        Node temp = last.next;
        do {
            System.out.print(temp.data + " <-->");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("");
    }

}
