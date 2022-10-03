package QuesAndAns;

public class Trancating {
//    https://leetcode.com/problems/truncate-sentence/
//     removing last word from string.
    public static void main(String[] args) {
        int k = 3;
        String s = "Hello how are you contestent";
        System.out.println(trun(s, k));
    }

    public static String trun(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < k; i++) {
            sb.append(arr[i]);
            if (i + 1 != k)
                sb.append(" ");
        }
        return sb.toString();
    }
}
