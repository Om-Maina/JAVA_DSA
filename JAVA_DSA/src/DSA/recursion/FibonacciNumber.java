package DSA.recursion;

import com.sun.security.jgss.GSSUtil;

public class FibonacciNumber {
    public static void main(String[] args) {
      int ans = fibo(50);
        System.out.println(ans);
    }
    static int fibo(int n){
        //base condition.
    if(n<2){
    return n;
    }
    return fibo(n-1) + fibo(n-2);
    }
}


