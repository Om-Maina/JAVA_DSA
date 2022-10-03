import java.util.*;

public class Test {
    public static void main(String[] args) {
        repectNO();
//        int[] arr = {1, 2, 3, 4, 5};
//        Arrays.toString(reverse(arr));
//        String str = "ommeena", nstr ="";
//        String nstr = "";
//        reverse1(str,nstr);
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        prime(n);

//        System.out.println(fib(n));
    }

    public static void repectNO() {
        int n = 15757877;
        int temp = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                temp++;
            }
        }
        System.out.println(temp);
    }
}

//    public static int fib(int n) {
//        if (n < 2) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }
//
//    //
//    public static void prime(int n) {
//        int c = 2;
//        while (c * c <= n) {
//            if (n % c == 0) {
//                System.out.println("not");
//                System.exit(0);
//            } else {
//                c += 1;
//            }
//        }
//        System.out.println("prime");
//    }
//
//    public static int[] reverse(int[] arr) {
////        int []arr1 = new int[];
//        int n = arr.length;
//        for (int i = n - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//        return arr;
//    }
//
//    public static void reverse1(String str, String nstr) {
//        char ch;
//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i);
//            nstr = ch + nstr;
//            System.out.print(nstr);
//        }
//    }
//
//}


//        array();
//        pattan();
//        String s1 = new String("om");
//        s1.concat("soft");
//        System.out.println(s1);

//       StringBuffer sb = new StringBuffer("om");
//       sb.append("soft");
//        System.out.println(sb);
//        String s2 = new String("om");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));

//        ArrayList<Integer> arr = new ArrayList<>();
//        ArrayList<String> arr1 = new ArrayList<>();
//        arr1.add("om");
//        arr1.add("meena");
//        arr1.add("sak");
//        arr1.add("ram");
//        arr1.add("yash");
//        arr.add(1);
//        arr.add(3);
//        arr.add(4);
//        arr.add(2);
//        arr.add(5);
//
//        HashMap<ArrayList<Integer>,String> hashmap = new HashMap();
////hashmap.put(1,"om");
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.size(); j++) {
//                hashmap.put(arr,"arr1");
//                System.out.println(hashmap);
//            }
//        }

//        System.out.println(arr);
//        Collections.sort(arr);
//        System.out.println(arr);
//        Set<Integer> sort = new TreeSet<>();
//        sort.addAll(arr);
//        System.out.println(sort);
//    }
//
//    public static void array() {
//        int[] arr = {2, 3, 4, 1, 4, 5};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void pattan(){
//        int row = 5;
//        for (int i = 1; i <= row ; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}
