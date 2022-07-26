package DSA.recursion.searchingAndSorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1 };
        // arr = sort(arr);
        //System.out.println(Arrays.toString(arr));

        // second way
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] First, int[] Second) {
        int[] mix = new int[First.length + Second.length];
        int j = 0;
        int i = 0;
        int k = 0;

        while (i < First.length && j < Second.length) {
            if (First[i] < Second[j]) {
                mix[k] = First[i];
                i++;
            } else {
                mix[k] = Second[j];
                j++;
            }
            k++;
        }
        while (i < First.length) {
            mix[k] = First[i];
            i++;
            k++;
        }
        while (j < Second.length) {
            mix[k] = Second[j];
            j++;
            k++;
        }
        return mix;
    }


// Second way of merge sort.


    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int j = s;
        int i = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

//        it may be possible that one of the arrays is not complete
//        copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}

