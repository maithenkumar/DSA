package stack;

import java.util.Arrays;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;
    Stack (int size){
        arr=new int [size];

        capacity = size;
        top=-1;
    }
    public void push(int n ){
if(isFull()){

    System.out.println("OverFlow\nProgram Terminated\n");
      System.exit(1);

}
else{
    System.out.println("inserting "+ n);
    arr[++top]=n;
    
}
    }
    public int pop(){
     if (isEmpty()) {
      System.out.println("STACK EMPTY");
      System.exit(1);
    }
    return arr[top--];
  }
  public void remove(){
     if (isEmpty()) {
      System.out.println("STACK EMPTY");
      System.exit(1);
    }
    else{
        arr[top--]=0;
        
    }
    
  }
  public void printStack(){
    for(int i=0; i<top;i++){
              System.out.print( " --->" +arr[i] );

    }
              System.out.println("");
    
  }
public boolean isFull(){
   
        return top==capacity-1;
    
     

}
    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        if (top==-1) {
            return true;
            
        }
        return false;
    }
     public boolean isNotEmpty(){
        if (top==-1) {
            return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        Stack stack = new Stack(7);
        stack.push(1);
                stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(1);

                stack.remove();

        
            System.out.println(stack.size());
            stack.printStack();
            System.out.println(stack.pop());

    }
    
}
