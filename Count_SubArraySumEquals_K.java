package SDET_Arrays;

public class Count_SubArraySumEquals_K {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = CountSubArraySumEqualsK(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
//    Brute force approach
    /*static int subarraysumCount(int[] arr, int K){
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum =0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==K){
                    c++;
                }
            }
        }
        return c;
    }*/
//  Optimal Approach
    static int CountSubArraySumEqualsK(int[] arr, int k){
        int n = arr.length;
        int cnt = 0;

        for (int i = 0 ; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {

                sum += arr[j];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    }

}
