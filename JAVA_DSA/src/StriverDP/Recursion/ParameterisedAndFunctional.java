package StriverDP.Recursion;

import java.util.Scanner;

public class ParameterisedAndFunctional {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Enter no. ");
        int n = scan.nextInt();
//        function(n,0);
        System.out.println(functional(n));
    }
    static void function(int i , int sum){
        if (i<1){
            System.out.println(sum);
            return;
        }
        function(i-1,sum + i);
    }
    static int functional(int n){
        if (n ==0){
            return 0;
        }
        return n + functional(n - 1);
    }
}
