package QuesAndAns;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Arrays.toString(reverse(arr));
    }
    public static int[] reverse(int arr[]){
        int a = arr.length;
        for (int i = a - 1; i >= 0 ; i--) {
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}
