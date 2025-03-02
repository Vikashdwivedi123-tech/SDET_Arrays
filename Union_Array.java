package SDET_Arrays;

import java.util.ArrayList;
import java.util.HashSet;
// Better Approach
public class Union_Array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,4,5,3,6};
        int[] arr2 = {1,2,3,3,4,5,2,7,8,9,10};
        System.out.println("Union of the two array is: "+UnionArray(arr1,arr2));
    }
    static ArrayList<Integer> UnionArray(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        for(int num:set){
            union.add(num);
        }
        return union;
    }
}
