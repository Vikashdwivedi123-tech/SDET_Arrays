package SDET_Arrays;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {2,8,3,4};
        System.out.println(largest_Element(arr));
    }
    static int largest_Element(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
