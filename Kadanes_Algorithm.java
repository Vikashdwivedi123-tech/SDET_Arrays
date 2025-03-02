package SDET_Arrays;

public class Kadanes_Algorithm {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = subarraysum(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
    static int subarraysum(int[] arr){
        int maxi = -1;
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
}
