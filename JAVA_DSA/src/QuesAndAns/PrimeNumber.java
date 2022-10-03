package QuesAndAns;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//        fib();
        int []arr = {1,2,3,4,5};
//       Arrays.toString(reverse(arr));
stringreverse();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("NOT PRIME");
                System.exit(0);
            }
        }
        System.out.println("PRIME");
    }

    public static void fib(){
        int n1 =0, n2 =1, n3, sol=10;
        System.out.print(n1 + " " + n2);
        for (int i = 0; i < sol; i++) {
           n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        }
        public static int[] reverse(int []arr){
        int n = arr.length;
            for (int i = n - 1 ; i >=0 ; i--) {
                System.out.print(arr[i] + " ");
            }
            return arr;
        }

        public static void  stringreverse(){
        String str = "ommaina", nstr ="";
        char ch;
            for (int i = 0; i < str.length() ; i++) {
                ch  = str.charAt(i);
                nstr = ch + nstr;

            }
            System.out.print(nstr);
        }

    }

