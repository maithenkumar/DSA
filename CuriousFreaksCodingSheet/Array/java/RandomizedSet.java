package CuriousFreaksCodingSheet.Array.java;

import java.util.ArrayList;

class RandomizedSet {
    public static void main(String[] args) {
      
        System.out.println((int)Math.random()*(5-1-0+1)+0);
    }
    java.util.Random rand = new java.u  til.Random();

    ArrayList<Integer> arr;

    public RandomizedSet() {
        arr = new ArrayList<>();

    }

    public boolean insert(int val) {
        if (arr.contains(val)) {
            return false;
        }
        return arr.add(val);
    }

    public boolean remove(int val) {
        if (arr.contains(val)) {
            arr.remove(val);
            return true;
        }
        return false;

    }

    public int getRandom() {
                // int a = (int)Math.random()*(arr.size()-1-0+1)+0;   
                int a = arr.get( rand.nextInt(arr.size()) );
        return a;

    }
}