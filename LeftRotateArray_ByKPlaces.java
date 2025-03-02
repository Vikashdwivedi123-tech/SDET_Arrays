package SDET_Arrays;

public class LeftRotateArray_ByKPlaces {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 2;
        Rotateleft(arr, n, k);
        System.out.print("After Rotating the k elements to left ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void Rotateleft(int[] arr, int n, int k) {
        Reverse(arr, 0, k - 1);
        Reverse(arr, k , n - 1);
        Reverse(arr, 0, n - 1);
    }
    public static void RotateRight(int arr[], int n, int k) {
        if (n == 0) return;
        k = k % n; // To rotate by more than the size of array ex - 8 then we use 7 + 1...
        Reverse(arr, 0, n - 1);
        Reverse(arr, 0, k - 1);
        Reverse(arr, k, n - 1);
    }
}
