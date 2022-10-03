package QuesAndAns;

import java.util.*;

public class RreverseList{
    public static void main(String[] args) {
        List<String> color = new ArrayList<>(Arrays.asList("red", "blue", "black"));
//        color.add();
//        color.add();
////        color.add();
//        for (int i = 0,j = color.size() - 1 ;  i < j ; i++) {
//            color.add(i, color.remove(j));
//        }
        Collections.reverse(color);
        System.out.println(color);
    }
}
