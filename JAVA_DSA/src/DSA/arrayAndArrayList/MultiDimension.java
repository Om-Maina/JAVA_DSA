package DSA.arrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[3][3];

        // input
        for (int row = 0; row< arr.length ; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= scan.nextInt();
            }
        }
        // enhanced for loop output

        for (int [] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        // output best

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        // output
//        for (int row = 0; row< arr.length ; row++) {
//
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//        }

    }
}
