package CuriousFreaksCodingSheet.Array.java;

public class TrappingRainWater {
    public static void main(String[] args) {
        int N = 6;
        int arr[] = { 3, 0, 0, 2, 0, 4 };
        System.out.println(trappingWater2(arr, N));

    }

    static long trappingWater2(int arr[], int n) {
        int count = 0;  
        for (int i = 0; i < arr.length-1; i++) {
            int sum = 0;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    break;
                }
                if (arr[j] < arr[i]) {
                    count = Math.max(count, arr[j] * sum);
                }
                sum += 1;
            }

        }
        return count;
    }

    static long trappingWater(int arr[], int n) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            // temp = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0) {
                    break; // {3,0,0,2,0,4};
                } else if (arr[j] == 0) {
                    temp += arr[i];
                    continue;
                } else if (arr[j] >= arr[i]) {
                    // count += temp;
                    break;
                } else {
                    temp += arr[i] - arr[j];
                }
            }
            count = Math.max(count, temp);
            temp = 0;

        }
        return count;
    }
}
