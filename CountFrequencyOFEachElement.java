package SDET_Arrays;
import java.util.*;
public class CountFrequencyOFEachElement {
    public static void main(String args[]){

        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        CountFrequency(arr, n);
    }
    static void CountFrequency(int arr[], int n)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: arr)
        {
            if (map.containsKey(num))
            {
                map.put(num, map.get(num) + 1);
            }
            else
            {
                map.put(num, 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
