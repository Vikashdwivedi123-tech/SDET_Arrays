package SDET_Arrays;

public class LeftRotate_ArrayByOne {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        RotateArray2(arr);
    }
    /*   Brute force approach
    Step 1 - Create an array of same length.
    step 2 - Shift the array element from index 1
    Step 3 - Replace the first element to the last index in the output array.

    static void RotateArray(int arr[]){
        int temp [] = new int[arr.length];
        for(int i=1;i<arr.length;i++){
            temp[i-1]=arr[i];
        }
        temp[arr.length-1]=arr[0];
        for(int num : temp){
            System.out.print(num+" ");
        }
    }*/
//    Note - Here Time complexity is O(n) and Space complexity is also O(n) because wr are creating a new array of same size.
    static void RotateArray2(int arr[]){
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = temp;
        for(int n : arr){ // for each loop
            System.out.print(n+" ");
        }
    }

}
