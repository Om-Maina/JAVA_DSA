package DSA.searchingAlgo.jumpSearch;

import java.util.Scanner;

public class JumpSearch {
    //Time Complexity : O(√n)
    //Auxiliary Space : O(1)

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 9;

        int ans = jumpsearch(arr, key);
        System.out.println(ans);
    }

    private static int jumpsearch(int[] arr, int key) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        // Doing a linear search for x in block
        // beginning with prev.
        while (arr[prev] < key) {
            prev++;

            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }
        // If element is found
        if (arr[prev] == key)
            return prev;

        return -1;
    }
}