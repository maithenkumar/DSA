package LinkedList.linkedList;

// public class linkedList {
//     Node head;

//     linkedList() {
//         head = null;
//     }

//     public class Node {
//         int data;
//         Node next;

//         Node(int val) {
//             data = val;
//             next=null;

//         }

//     }
//     public void insertAtPosition(int val,int index){
//         Node newNode=new Node(val);
//         Node temp=head;
//         for (int i = 0; i < index; i++) {
//            temp=temp.next;
//         }
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public void insertLast(int val){
//         Node n = new Node(val);

//     }
//     public int length(){
//     Node temp=head;
//     int index=0;
//     while (temp!=null) {
//         temp=temp.next;
//         index++;

//     }
//     return index;

// }
// public void display(){
//     Node temp=head;
//     while (temp!=null) {
//         System.out.print(temp.data +" ");
//         temp=temp.next;

//     }
//     System.out.println("");
// }
//     public void insertingAtBeginning(int val) {
//         Node newnode = new Node(val);
//         if (head == null) {
//             head = newnode.next;

//         }
//         newnode.next = head;
//         head = newnode;

//     }
// }

/**
 * linkedList
 */
public class linkedList {
    Node head;

    /**
     * Node
     */
    public class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }

    }

    linkedList() {
        head = null;

    }

    public void insertingAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public int length() {
        int index = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            index++;

        }
        return index;
    }

    public void display() {
        Node temp = head;
        for (int i = 0; i < length(); i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println("");

    }
    //  public linkedList mergeTwoLists(linkedList list1, linkedList list2) {
    //     while(list1 != null && list2 != null) {
    //         if(list1.data <= list2.data) {
    //             list1.next = mergeTwoLists(list1.next, list2);
    //             return list1;
    //         } else {
    //             list2.next = mergeTwoLists(list2.next, list1);
    //             return list2;
    //         }
    //     }
    //     return list1 == null ? list2 : list1;
    // }
        // public Node mergeTwoLists(Node list1, Node list2) {
        //   while (list2.next!=null) {
        //     // Nodetemp
        //     if (list1.data==list2.data||list1.data<list2.data) {
                
        //     }
            
        //   }
        // }
public Node  removeNthFromEnd(int n) {
    Node temp=head;
    Node per=head;
    for (int index = 0; index <=n; index++) {
        per=temp;
        temp=temp.next;

        
    }
    per.next=temp.next;
    return per;

}   public Node  removeNthFromEnd2(int n) {
    Node fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    

}
    public int search(int val) {
        int index = 0;
        Node temp = head;
        while (temp.data != val) {
            index++;
            temp = temp.next;

        }
        if (val != temp.data) {
            System.out.println("invalid value ");

        }
        return index;

    }

    public void deleteAtEnd() {
        Node temp = head;
        for (int i = 0; i < length() - 2; i++) {
            temp = temp.next;

        }

        temp.next = null;
    }

    public void insertAtPosition(int position, int val) {
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        newNode = temp.next;
        temp = newNode;

    }

    public int get(int position) {
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void update(int pos, int val) {
        Node temp = head;
        for (int i = 0; i < pos; i++)
            temp = temp.next;

        temp = null;

    }
 public Node  reverseList() {
    Node pNode=null;
        Node current = head;
        Node next = current.next;
        while (current!=null) {
            next=current.next;
            current.next=pNode;
            pNode=current;
            current=next;
            
        }
        return pNode;
    }
    public void reverse() {
        Node perv = null;
        Node current = head;
        Node next = head.next;
        while (current != null) {
            next = current.next;
            current.next = perv;
            perv = current;
            current = next;

        }
        head = perv;
    }
}