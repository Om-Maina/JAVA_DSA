package QuesAndAns;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = scan.nextInt();
        table(n);
    }

    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            int tab = n * i;
            System.out.println(n + " " + "x" + " " + i + "=" + tab);
        }
    }
}
