package DSA.recursion.esay;

public class DigitSum {
    public static void main(String[] args) {
        int ans = sum1(1342);
        System.out.println(ans);
    }

    static int sum1(int a) {

        if (a == 0)
        {
            return 0;
        }
        return (a%10) + sum1(a/10);
    }
}
