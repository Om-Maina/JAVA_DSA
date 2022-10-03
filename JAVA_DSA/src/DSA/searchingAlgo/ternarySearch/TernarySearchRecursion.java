package DSA.searchingAlgo.ternarySearch;

import java.util.Scanner;

public class TernarySearchRecursion {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = arr[0];
        int end = arr.length;
        System.out.println("Enter Element to find: ");
        int key = scan.nextInt();
        int ans = ternarySearch(start, end, key, arr);
        if (ans == -1) {
            System.out.println("Element Not Found ");
        } else {
            System.out.println("Index of " + key + " is " + ans);
        }
    }

    private static int ternarySearch(int start, int end, int key, int[] arr) {
        if (end >= start) {

            // Find the mid1 and mid2
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;

            // Check if key is present at any mid
            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }

            if (key < arr[mid1]) {

                // The key lies in between l and mid1
                return ternarySearch(start, mid1 - 1, key, arr);
            } else if (key > arr[mid2]) {

                // The key lies in between mid2 and r
                return ternarySearch(mid2 + 1, end, key, arr);
            } else {

                // The key lies in between mid1 and mid2
                return ternarySearch(mid1 + 1, mid2 - 1, key, arr);
            }
        }

        // Key not found
        return -1;
    }
}
