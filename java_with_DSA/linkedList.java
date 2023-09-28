

class linkedList{
    private Node head;
    private Node tail;
        private int  size;

    linkedList(){
        this.size=0;

    }
    public void  dispaly( ){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.value+" --> "+temp.next+" -->  ");
            temp=temp.next;
        }

        System.out.println("end");

    }
public void inSertFirst(int val){
    Node node=new Node(val);
    node.next=head;
    head=node;
    System.out.println(node.value);
    System.out.println(node.next);
    

    if (tail==null) {
        tail=head;
        
    }
    size+=1;
}


    class Node{
        private   int value;
        private Node next;
        Node(int val ){
            this .value=val ;
        }
        Node(int val,Node next){
            this .value=val ;
            this .next=next ;

        }
        public static void main(String[] args) {
            linkedList ll=new linkedList();

                ll.inSertFirst(3
                )
                ;
                                ll.inSertFirst(3);  
                ll.inSertFirst(3);  
                ll.inSertFirst(3);  
                ll.inSertFirst(3);  
  ll.dispaly();
            }
    } 
}