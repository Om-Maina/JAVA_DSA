package DSA.arrayAndArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String[] str = new String[5];
//        str[0] = "Om ";
//        str[1] = "Meena ";
//        str[2] = "Ram ";
//        str[3] = "Yash ";
//        str[4] = "Kiran ";

        ArrayList<String> list = new ArrayList<String>();



//          adding element in arraylist
//            list.addAll(List.of(str));
//            list.set(1, "meena1");
//            list.remove(2);


        //taking input
        for (int i = 0; i < 5; i++) {
            list.add(scan.next());
        }

//       geting item at any index // also printing elements
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
        }
        System.out.println();


//         reverse arraylist
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }

        //printing arraylist
        System.out.println(list);

    }
}
