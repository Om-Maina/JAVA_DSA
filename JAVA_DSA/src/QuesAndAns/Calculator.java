package QuesAndAns;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print(" enter op : ");
            char op = scan.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("enter two no: ");
                int num = scan.nextInt();
                int num2 = scan.nextInt();
                if (op == '+') {
                    ans = num + num2;
                }
                if (op == '-') {
                    ans = num - num2;
                }
                if (op == '*') {
                    ans = num * num2;
                }
                if (op == '/') {
                    if (num2 != 0)
                        ans = num / num2;
                }
                if (op == '%') {
                    ans = num % num2;
                }
            } else if (op == 'x' || op == 'X') {
                System.out.println("bye bye");
                break;
            } else {
                System.out.print("invaild op");
            }
            System.out.println("Ans is : ");
            System.out.println(ans);
        }
    }
}
