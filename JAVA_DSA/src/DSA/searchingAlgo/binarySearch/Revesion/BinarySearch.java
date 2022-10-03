package DSA.searchingAlgo.binarySearch.Revesion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int target = 0;
        int n = arr.length;
        int result = BSearch(arr, target, 0, n - 1);
        if (result == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found At " + result + " Index");
        }
    }

    private static int BSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;

        }
        return -1;
    }
}
