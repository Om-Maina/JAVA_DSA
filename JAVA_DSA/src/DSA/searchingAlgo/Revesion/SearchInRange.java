package DSA.searchingAlgo.Revesion;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 56, 66, 7};
        int target = 7;
        int result = search(arr, target, 2, 5);
        if (result == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Is At Index " + result);
        }
    }

    public static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}