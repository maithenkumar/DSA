package LinkedList.linkedList;

public class startingPoint {
    public static void main(String[] args) {
        
        linkedList arr=new linkedList();
        arr.insertingAtBeginning(1);
        arr.insertingAtBeginning(2);
        arr.insertingAtBeginning(3);
        arr.insertingAtBeginning(4);
        arr.insertingAtBeginning(5);
        arr.removeNthFromEnd2(0);

        linkedList arr2=new linkedList();
        arr2.insertingAtBeginning(1);
        arr2.insertingAtBeginning(2);
        arr2.insertingAtBeginning(3);
        arr2.insertingAtBeginning(4);
        arr2.insertingAtBeginning(5);
        arr2.removeNthFromEnd2(0);
        // arr.mergeTwoLists(arr, arr2);
        // System.out.println(arr.reverseList());
        // arr.insertAtPosition(3,8);

        // arr.update(0, 5);   
        // arr.deleteAtEnd();  
// arr.reverse();
        // System.out.println(arr.search(11));   
        arr.display();
        // System.out.println(arr.length());
        

    }
    
}
