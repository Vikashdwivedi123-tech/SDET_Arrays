package SDET_Arrays;

public class Check_Sorted_Array {
    public static void main(String[] args) {
        int [] arr = {2,1,5,6};
        System.out.println(Checksorted(arr));
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Checksorted(arr2));
    }
    // Approach - 1 (Bruite force)
    /*static boolean CheckSortedArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }

        }
        return true;
    }*/

    // Approach - 2 (Optimal)
    static boolean Checksorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
//    }
    }
}
