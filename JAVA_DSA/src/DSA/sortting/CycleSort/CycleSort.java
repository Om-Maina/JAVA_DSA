package DSA.sortting.CycleSort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,2};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void cycle(int []arr){
        int i =0;
          while (i < arr.length){
              int correct = arr[i] -1;
              if (arr[i] != arr[correct]){
                  swap(arr, i , correct);
              }else{
                  i++;
              }
        }
    }
}
