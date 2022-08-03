package newCodes.maths;

public class Square {
    public static void main(String[] args) {
        System.out.println(findSquare(145));
    }
    public static int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
            //System.out.print(rem);
        }
        return ans;
    }
}
