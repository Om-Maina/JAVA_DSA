package StriverDP;

import java.util.Scanner;

public class FibonacciAndTable {
    public static void main(String[] args) {
      // print first ten number of fibonacci.
        int n=0,n2=1,n3,count=10;
        System.out.print(n+ " " +n2);
        for (int i = 2; i < count; ++i) {
            n3 = n + n2;
            System.out.print(" " +n3);
        n = n2;
        n2 = n3;
        }

        //using recursion
       int ans = fib(10);
        System.out.println(" "+ans);
   table(2);
    }

    static int fib(int n){
        if(n < 2){
            return n;
        }
        return fib(n-1)+ fib(n-2);
}
static void table(int n){
    for (int i = 0; i <= 10; i++) {
        int sum = n * i;
        System.out.println(n + "*" + i + "=" + sum );
    }
}
}
