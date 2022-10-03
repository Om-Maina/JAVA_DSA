package DSA.searchingAlgo.Revesion;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
       String  str = "SAKSHI";
        char target = 'S';
        System.out.println(linear(str,target));

        System.out.println(Arrays.toString(str.toCharArray()));
    }
    public static boolean linear1(String str , char target){
        if(str.length() == 0){
            return false;
        }
        for (char ch: str.toCharArray()) {
            if (target == ch){
                return true;
        }
        }
        return false;
    }
    public static boolean linear(String str , char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
