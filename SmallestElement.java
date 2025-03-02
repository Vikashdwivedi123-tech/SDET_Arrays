package SDET_Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int [] arr = {2,1,4,5};
        System.out.println(minElement(arr));
    }
    static int minElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
