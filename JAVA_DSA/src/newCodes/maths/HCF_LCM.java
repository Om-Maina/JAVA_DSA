package newCodes.maths;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

//hcf of a&b = min +ve value of eqN (ax + yb) where a & b is integer.
public class HCF_LCM {
    // whatever hcf you will get that will come out as common.
    public static void main(String[] args) {
     //   System.out.println(gcd(4,9));
        System.out.println(lcm(2,7));
    }
    //euclidean algo.
    //hcf
    static int gcd(int a, int b){
    if(a==0) {
    return b;
}
        return gcd(b%a,a);
    }
    //lcm (a,b) = a * b/ hcg(a,b)
    static int lcm(int a, int b){
return a*b/gcd(a,b);
    }
}
