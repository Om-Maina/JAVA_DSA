package DSA.searchingAlgo.ternarySearch;

import java.util.Scanner;
// array show be sorted in ascending order.
public class TernarySearchIterative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = arr[0];
        int end = arr.length;
        System.out.println("Enter Element to find: ");
        int key = scan.nextInt();
        int ans = ternarysearch(start, end, key, arr);
        if (ans == -1) {
            System.out.println("Element Not Found ");
        } else {
            System.out.println("Index of " + key + " is " + ans);
        }
    }

    private static int ternarysearch(int start, int end, int key, int[] arr) {
        while (end >= start) {

            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;

            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }

            if (key < arr[mid1]) {
                end = mid1 - 1;
            } else if (key > arr[mid2]) {
                start = mid2 + 1;
            } else {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        return -1;
    }
}
