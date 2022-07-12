package DSA.Sortting.CycleSort;

//https://leetcode.com/problems/missing-number/
//amozon question
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,5,0,2,3};

    System.out.println(missingnumber(arr));
}
       static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
       public static int missingnumber(int []arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i]  != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index =0 ; index < arr.length;index++){
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
}

