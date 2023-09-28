package queue;

public class queue {
    int front, rear;
    int SIZE = 5;
    int[] arr = new int[SIZE];

    queue() {
        // SIZE = size;
        front = -1;
        rear = -1;
    }

    public void enque(int n) {
        if (isFull()) {
            System.out.println("queue is full");

        } else {
            if (front == -1) 
                front = 0;
            rear++;
            arr[rear] = n;
             System.out.println("Inserted " + n);

            

        }

    }

    public int dequeue() {
        int elmen;
        if (isEmpty()) {
            System.out.println("queue is empty");
            return (-1);

        } else {
            elmen = arr[front];
            if (front >= rear) {
                front = -1;
                rear = -1;

            } else {
                front++;

            }
            System.out.println("deleted -->"+ elmen);
            return (elmen);
        }

    }

    public void printData() {
        System.out.println("Iam feel like so lonly");
    }

    public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        queue qe = new queue();

        qe.enque(1);
        qe.enque(2);
        qe.enque(3);
        qe.enque(4);
        qe.enque(5);
        qe.enque(6);
        qe.dequeue();
                qe.dequeue();
        qe.dequeue();
        qe.dequeue();
        qe.dequeue();
        qe.dequeue();
        qe.dequeue();

        // System.out.println(qe.dequeue());
        // System.out.println(qe.isEmpty());
    }
}
