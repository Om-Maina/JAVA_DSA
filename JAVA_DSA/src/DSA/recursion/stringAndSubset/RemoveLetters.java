package DSA.recursion.stringAndSubset;

public class RemoveLetters {
    public static void main(String[] args) {
//        Skip("", "baccdah");
//        System.out.println(Skip1("baccdah"));
//        System.out.println(SkipApple("basappleebd"));
        System.out.println(SkipAppNotApple("bappsapplebd"));
    }

    static void Skip(String s, String up) {
        if (up.isEmpty()) {
            System.out.println(s);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            Skip(s, up.substring(1));
        } else {
            Skip(s + ch, up.substring(1));
        }
    }

    //    second example
    static String Skip1(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'b') {
            return Skip1(up.substring(1));
        } else {
            return ch + Skip1(up.substring(1));
        }
    }
//skiping apple from the string.
    static String SkipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return SkipApple(up.substring(5));
        } else {
            return up.charAt(0) + SkipApple(up.substring(1));
        }
    }

//  skip app
static String SkipAppNotApple(String up) {
    if (up.isEmpty()) {
        return "";
    }
    if (up.startsWith("app")&& !up.startsWith("apple")) {
        return SkipAppNotApple(up.substring(3));
    } else {
        return up.charAt(0) + SkipAppNotApple(up.substring(1));
    }
}
}
