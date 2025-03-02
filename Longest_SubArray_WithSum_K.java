package SDET_Arrays;

public class Longest_SubArray_WithSum_K {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        int len = longestsubarray(arr, 10);
        System.out.println("The length of the longest subarray is: " + len);
    }
    // Brute force approach, Time Complexity is nearly O(n^3)
    /* static int longestSubarraySum(int[] arr, int K){
        int result=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                long sum = 0;
                for(int k=i;k<j;k++){
                    sum+=arr[k];
                }
                if (sum == K)
                    result = Math.max(result, j - i + 1);
            }

        }
        return result;
    }*/
    // Approach - 2 Here time complexity is O(n^2)
    static int longestsubarray(int[] arr, int K){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr.length;j++) {
                sum += arr[j];
                if (sum == K)
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }
}

