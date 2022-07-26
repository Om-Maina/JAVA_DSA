package DSA.recursion.searchingAndSorting;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return binarySearch(arr, target, s, m - 1);
        }
        return binarySearch(arr, target, m + 1, e);
    }
}
