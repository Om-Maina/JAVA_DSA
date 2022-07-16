package DSA.recursion.arrayQuestions;

public class SortedArray {
    // check array is sorted or no. in ascending order
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 4, 12};
        System.out.println(sort(arr, 0));
    }

    static boolean sort(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;

        }
        return arr[index] < arr[index + 1] && sort(arr, index + 1);
    }
}
