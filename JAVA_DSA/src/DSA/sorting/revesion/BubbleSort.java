package DSA.sorting.revesion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {22, 11, 43, 2, 6, 55};
//        System.out.println(Arrays.toString(bublesort(arr))); // if be return value from function.
        bublesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bublesort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {

                // swapping
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
//        return arr;
    }
}
