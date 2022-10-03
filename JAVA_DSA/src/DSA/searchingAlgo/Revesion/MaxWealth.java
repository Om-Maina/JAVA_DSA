package DSA.searchingAlgo.Revesion;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr = {
                {11,21,32},
                {4,5,6},
                {7,8,9},
        };
        System.out.println(maximumWealth(arr));

    }
    public static int maximumWealth(int[][] accounts) {

        // person = row;
        // account = col;
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum =0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans){
                ans = sum;
        }
    }
        return ans;
    }
}
