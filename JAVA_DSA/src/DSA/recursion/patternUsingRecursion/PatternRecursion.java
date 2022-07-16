package DSA.recursion.patternUsingRecursion;

public class PatternRecursion {
    public static void main(String[] args) {
//        triangle(4, 0);
        triangle1(4,0);
    }

    //normal triangle.
    static void triangle1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle1(r, c + 1);
            System.out.print("*");
        } else {
            triangle1(r - 1, 0);
            System.out.println();
        }
    }

    // triangle
    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }
}
