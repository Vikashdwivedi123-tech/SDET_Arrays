package SDET_Arrays;

//Optimal approach..
public class RightRotate_ArrayByKPlaces {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 2;
        RotateRight(arr,k);
        System.out.println("After Rotating the k elements to right");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void Reverse(int arr[], int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void RotateRight(int arr[], int k){
        if(arr.length==0) return;
        Reverse(arr,0,arr.length-1);
        Reverse(arr,0,k-1);
        Reverse(arr,k,arr.length-1);
    }
}
