package QuesAndAns;

public class RepectNo {
    public static void main(String[] args) {
//        repectNO();
        reverseno();
    }
    public static void repectNO() {
        int n = 138393;
        int temp = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                temp++;
            }
            n = n/10;
        }
        System.out.println(temp);
    }
    public static void reverseno(){
        int n = 12345;
        int temp = 0;
        while (n > 0){
            int rem = n % 10 ;
            n /= 10;
            temp = temp * 10 + rem;
        }
        System.out.println(temp);

    }
}
