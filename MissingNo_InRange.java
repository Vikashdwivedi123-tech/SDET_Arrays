package SDET_Arrays;

public class MissingNo_InRange {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        System.out.println("The Missing no is: "+missingNo(arr,5));
    }
    public static int missingNo(int[] arr, int n){
        int sum1 = n*(n+1)/2;
        int sum2=0;
        for (int j : arr) {
            sum2 += j;
        }
        return sum1-sum2;
    }
}
