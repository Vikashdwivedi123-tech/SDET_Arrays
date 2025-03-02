package SDET_Arrays;
// Here I am returning the index no on which the element is found.
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int k = 3;
        System.out.println(linearsearch(arr,k));
    }
    public static int linearsearch(int arr[], int k){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
