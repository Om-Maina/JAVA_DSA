package QuesAndAns;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ommeena", nstr = "";
        reverseString(str, nstr);
    }
    public static void reverseString(String str, String nstr) {
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println(nstr);
    }
}