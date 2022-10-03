package DSA.arrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

// array of primitive
//         Taking input in array using for loop and scanner.
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scan.nextInt();
//        }

//         best way to print
//        System.out.println(Arrays.toString(arr));

//        Printing array.
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        printing arr using while loop
//        int i = 0;
//        while (i < arr.length) {
//            System.out.print(arr[i]+ " ");
//            i++;
//        }

//         printing array by enhance for loop
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }


        // string type array
//        String[] str = new String[5];
//        str[0] = "Om ";
//        str[1] = "Meena ";
//        str[2] = "Ram ";
//        str[3] = "Yash ";
//        str[4] = "Kiran ";

//         enhance for loop for printing stringarr
//        for (String s : str) System.out.print(s);
//
//        System.out.println();
//
////        reversing stringarray using for loop
//        for (int i = str.length - 1; i >= 0; i--) {
//            System.out.print(str[i]);
//        }

//
//        array of object

        String []str = new String[4];
        for (int i = 0; i < str.length; i++) {
         str[i]= scan.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
