package newCodes.maths;

public class BSSquareRoot {
    //using binary Search square root.
    public static void main(String[] args) {

        int n =40;
        int p = 3;

        System.out.printf("%.3f",sqrt(n,p));

    }
    // time: o(log(n)
    static double sqrt(int n , int p){
 int start = 0;
         int end =n;
 double root = 0.0;

    while(start<=end){
        int middle = start +(end - start) /2;

        if (middle * middle ==n){
            return middle;
        }
        if (middle * middle >n){
            end = middle - 1;
        }else {
            start = middle + 1;
        }
    }
    double incr =0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /=10;
        }
        return root;
    }
}
