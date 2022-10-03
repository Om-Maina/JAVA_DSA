package StriverDP.Recursion;

import java.util.Scanner;

public class PrintName {
    // print name n time
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = scan.nextInt();
//        int i = 0;
        printNto1( n,n);
    }
    static void print1toN(int i , int n){
        if (i < 1){
            return;
        }
        print1toN(i -1 , n);
        System.out.print(i);
    }
    static void printNto1(int i , int n){
        if (i > n){
            return;
        }
        printNto1(i + 1 , n);
        System.out.print(i);
    }

    static void printno(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        printno(i + 1, n);
    }

    static void printnto1(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        printnto1(i - 1, n);
    }

    static void name(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("om maina");
        name(i + 1, n);
//        printno(i+1,n);

    }
}
