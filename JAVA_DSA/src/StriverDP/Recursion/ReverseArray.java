//package StriverDP.Recursion;
//
//import java.util.Scanner;
//
//public class ReverseArray {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scan.nextInt();
//        }
//        reverse(0, arr, n);
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i] + " ");
//        }
//    }
//
//    static void reverse(int i, int arr[], int n) {
//        if (i >= n / 2) {
//            return;
//        }
//        swap(arr[i], arr[n - i - 1]);
//        reverse(i + 1, arr, n);
//    }
//}
//
//
