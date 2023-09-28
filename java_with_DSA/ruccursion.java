public class ruccursion {
    public static void main(String args[]) {
        int[] arr = { 3, 2, 1 };
        // System.out.println( isStorted(arr,arr.length-1));
        towersofHanai(3, 'c', 'v', 'b');
    }

    static int itreating(int num) {
        if (num == 0) {
            return -1;
        }

        System.out.println(num);
        num -= 1;
        return itreating(num);
    }

    static int factriol(int num) {
        if (num == 0) {
            return 1;
        }
        if (num == 1) {
            return 1;
        }
        int num2 = num - 1;
        return num * factriol(num2);
    }

    static int isStorted(int arr[], int n) {
        if (n == 1) {
            return 1;
        }
        if (arr[0] < arr[arr.length - 1]) {

            return arr[n] > arr[n - 1] ? isStorted(arr, n - 1) : 0;

        }

        if (arr[0] > arr[arr.length - 1]) {

            return arr[n] < arr[n - 1] ? isStorted(arr, n - 1) : 0;

        }
        return -1;

    }

    static void towersofHanai(int n, char fromPrg, char toPrg, char auxpeg) {
        if (n == 1) {
            System.out.println(fromPrg + " ks " + toPrg + "" + auxpeg);
            return;

        }
        towersofHanai(n, fromPrg, auxpeg, toPrg);

        System.out.println(fromPrg + " ks " + toPrg + "" + auxpeg);

        towersofHanai(n, auxpeg, toPrg, fromPrg);
    }
}
