package newCodes.numberSystem;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("isodd =" + isOdd(n));
        System.out.println("isEVevn =" + isEven(n));
    }
    private static boolean isOdd(int n){
        return (n & 1 )==1;
    }
    private static  boolean isEven(int n){
        return (n & 0) == 0;
    }
}
