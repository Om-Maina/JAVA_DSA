package DSA.recursion.esay;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = product(1342);
        System.out.println(ans);
    }

    static int product(int a) {

        if (a%10 <= a)
        {
            return a;
        }
        return (a%10) * product(a/10);
    }
}
