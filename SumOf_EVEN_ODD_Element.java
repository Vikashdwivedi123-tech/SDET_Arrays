package SDET_Arrays;

public class SumOf_EVEN_ODD_Element {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(CountEvenOdd(arr));
    }
    static int CountEvenOdd(int[] arr){
        int even=0;
        int odd =0;
        for(int num : arr){
            if(num%2==0){
                even++;
            }else odd++;
        }
        return even+odd;
    }
}
