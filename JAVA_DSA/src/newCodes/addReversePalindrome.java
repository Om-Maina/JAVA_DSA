package newCodes;

import java.util.Scanner;

public class addReversePalindrome {

    static int reversNumber(int ans)
    {
        int reversed_n = 0;
        while (ans > 0) {
            reversed_n = reversed_n * 10 + ans % 10;
            ans = ans / 10;
        }
        return reversed_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = x + y;

        System.out.println("sum:" + ans);
        int reverse = reversNumber(ans);
        System.out.println(reverse);

        if (ans == reverse) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
