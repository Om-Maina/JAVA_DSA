package newCodes;

import java.util.Scanner;

public class mini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lm[] = new int[n];
        for (int i = 0; i < n; i++) {
            lm[i] = sc.nextInt();
        }
        int cost[] = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        long ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long ta = 0;
            for (int j = 0; j < n; j++) {
                ta += Math.abs(lm[i] - lm[j]) * cost[i];
            }
            ans = Math.min(ta, ans);
        }
        System.out.println(ans);
    }
}
