package QuesAndAns;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        fibo(); // to find fibo no on index;

        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < count; i++) {
            n3 = n2 + n1;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
    public static void fibo(){
        Scanner scan = new Scanner(System.in);
        int a = 0, b=1;
        int count =2;
        int n = scan.nextInt();
        while (count <= n){
            int temp = b;
            b =b +a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}

