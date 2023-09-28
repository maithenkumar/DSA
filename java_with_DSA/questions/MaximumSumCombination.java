package questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class MaximumSumCombination {
    public static void main(String[] args) {
        int[] A = { 3, 2 };
        int[] B = { 1, 4 };

        System.out.println(maxCombinations2(2, 2, A, B));
    }

    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        List<Integer> ans = new ArrayList<>();
        int[] temp = new int[N * N];
        int index = 0;
        // code here

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[index] = A[i] + B[j];
                index++;

            }
        }
        // Arrays.sort(temp);
        desending(temp);
        for (int i = 0; i < K; i++) {
            ans.add(temp[i]);

        }
        return ans;
    }

    static void desending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] <= arr[j + 1]) {
                    swap(arr, j, j + 1);

                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static List<Integer> maxCombinations2(int N, int c, int a[], int b[]) {
        // code here
        List<Integer> res = new ArrayList<Integer>();
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length - 1, m = b.length - 1;
        PriorityQueue<Pair> pq = new PriorityQueue<>((p, q) -> q.v - p.v); // Creating MAX Heap
        pq.add(new Pair(a[n] + b[m], n, m));
        Set<String> set = new HashSet<>();
        set.add(n + " " + m);
        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            res.add(cur.v);
            if (res.size() == c)
                break;
            int x = cur.x, y = cur.y;
            if (x - 1 >= 0 && !set.contains((x - 1) + " " + y)) {
                set.add((x - 1) + " " + y);
                pq.add(new Pair(a[x - 1] + b[y], x - 1, y));
            }
            if (y - 1 >= 0 && !set.contains(x + " " + (y - 1))) {
                set.add(x + " " + (y - 1));
                pq.add(new Pair(a[x] + b[y - 1], x, y - 1));
            }
        }
        return res;
    }

    static class Pair {
        int v, x, y;

        Pair(int v, int x, int y) {
            this.v = v;
            this.x = x;
            this.y = y;
        }
    }
}