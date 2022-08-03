package newCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test implements Cloneable{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);
        list.listIterator(3);
        System.out.println(list);
      //  System.out.println( list.listIterator(3));

        List<Integer> list1 = new ArrayList<>();
        ((ArrayList<Integer>) list).clone().equals(list1);
        System.out.println(list1);
    }
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int dp[][]=new int[coins.length+1][amount+1];
        for(int i=0;i<=amount;i++)dp[0][i]=100000;
        for(int i=0;i<=coins.length;i++)dp[i][0]=0;
        for(int i=1;i<=amount;i++){
            if(i%coins[0]==0)dp[1][i]=i/coins[0];
            else dp[1][i]=100000;
            System.out.print(dp[1][i]+" ");
        }
        for(int i=2;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(j>=coins[i-1]){
                    dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }

            }

        }
        if(dp[coins.length][amount]==100000)return -1;
        return dp[coins.length][amount];
}
}
