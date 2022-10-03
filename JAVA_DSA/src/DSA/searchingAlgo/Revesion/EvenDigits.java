package DSA.searchingAlgo.Revesion;

public class EvenDigits {
    public static void main(String[] args) {
        int []nums = {12,344, 4, 6, 7896 };
        System.out.println(findnumber(nums));
        System.out.println(digits2(-123456));
    }

    private static int findnumber(int []nums) {
        int count = 0;
        for (int num: nums) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int numofdigits = digits(num);
        /*
        if(numofdigits % 2 == 0)
        {
        return true;}
        return false;

         */
        return numofdigits % 2 == 0;
    }

    private static int digits2(int num){

        // this for negative num.
        if (num < 0){
            num = num * -1;
        }
        // this is use for +ve number
        return (int) (Math.log10(num)) +1;
    }
    private  static int digits(int num){
        int count = 0;
        while (num >0 ){
            count++;
            num = num /10; // num /= 10;
        }
        return count;
    }
}
