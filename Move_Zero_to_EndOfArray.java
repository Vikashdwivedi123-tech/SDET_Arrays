package SDET_Arrays;

import java.util.Arrays;
//Optimal Solution Using two pointer approach.
public class Move_Zero_to_EndOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        System.out.println(Arrays.toString(MoveZeroEnd(arr)));
    }
    static int[] MoveZeroEnd(int[] arr){
        int j = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return arr;
        for(int i = j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;

    }
}
