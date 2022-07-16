package DSA.recursion;

public class NumberRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){

        if(n == 10){
        return;
       }
        System.out.println(n);

        //recursive call
        // if you are canlling a function again and again , oyu can treat it as a separate call in the stack

        //this is called  tail recursion
        //this is the last function call
        print(n +1);
    }
}
