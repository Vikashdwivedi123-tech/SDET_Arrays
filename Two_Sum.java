package SDET_Arrays;

import java.util.Arrays;

import static java.lang.System.*;

public class Two_Sum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        out.println(Arrays.toString(twoSum(5,arr,10)));
    }
    // Approach -1
  /* static int[] TwoSum(int[] arr, int target){
        int[] ans = new int[2];
        ans[0]= ans[1] = -1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
        }*/
    // Optimal Approach -
    public static int[] twoSum(int n, int []arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left,right};
            } else if (sum < target){
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
