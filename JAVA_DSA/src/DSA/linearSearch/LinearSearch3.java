package DSA.linearSearch;

public class LinearSearch3 {
        //search the target and return true false.
        public static void main(String[] args) {
            int[] nums = {10, 20, 30, 40, 1, 23 , -4, -23};
            int target =23;
            boolean ans = linearSearch(nums , target);
            System.out.println(ans);
        }
        static boolean linearSearch(int []arr, int target){
            if(arr.length ==0){
                return false;
            }
            for (int element : arr){
                if (element == target){
                    return true;
                }
            } return false;
        }
    }
