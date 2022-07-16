package DSA.recursion.esay;

public class Palindrome {
    static int reverse(int n) {
        //sometime you need some additional variable in the arrgument
        //in the case, make another funtion
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) +
                helper(n / 10, digits - 1);
    }

    static boolean palin(int n) {
        return n == reverse(n);
    }

    static boolean palin2(int n) {
        if (reverse(n) == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // System.out.println(reverse(4321));
        // System.out.println(palin(1234321));
        System.out.println(palin2(12321));
    }
}

