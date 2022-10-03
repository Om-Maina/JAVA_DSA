package QuesAndAns;

public class WordsReverse {
    public static void main(String[] args) {
        String s= "Om maina is gandu";
        String str[] = s.split(" ");
        String s1 = "";

        for (int i = 0; i < str.length; i++)
        {
            String word = str[i];
            String s2 = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                s2 = s2 + word.charAt(j);
            }
            s1 = s1 + s2 + " ";
        }

        System.out.print(s1);
    }
    }