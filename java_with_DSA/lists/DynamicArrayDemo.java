package lists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicArrayDemo<T> {
    private static int size;
    private T[] arr;
    private int capacity;
    private final int intialCapacity;

    DynamicArrayDemo(int size) {
        intialCapacity = size;
        arr = (T[]) new Object[intialCapacity];
        this.size = 0;
        capacity = intialCapacity;

    }

    private void expandArr() {
        capacity *= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);

    }

    public void insertLast(T val) {
        if (size >= capacity)
            expandArr();

        arr[size] = val;
        size++;
    }

    public void insertBegin(T val) {

        if (size >= capacity)
            expandArr();
        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];

        }
        arr[0] = val;

        size++;
    }

    public void add(T val) {
        if (size >= capacity)
            expandArr();

        arr[size++] = val;

    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);

        }
        System.out.println("");
    }

    public void deleteAtIndex(int idx) {
        for (int i = idx; i < size - 1; i++) {
            arr[i] = arr[i + 1];

        }
        size--;

    }

    public void insertAtPos(int idx, T val) {
        if (size > capacity)
            expandArr();
        for (int i = size - 1; i <= idx; i--) {

            arr[i + 1] = arr[i];

        }
        arr[idx] = val;
        size++;

    }

    public int length() {
        return size;

    }

    public static void main(String[] args) {
        DynamicArrayDemo<Integer> arr = new DynamicArrayDemo<Integer>(5);
        

        System.out.println(arr.length());
        arr.display();

    }
}