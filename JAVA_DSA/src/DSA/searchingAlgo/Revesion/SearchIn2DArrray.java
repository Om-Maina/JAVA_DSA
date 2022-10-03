package DSA.searchingAlgo.Revesion;


import java.util.Arrays;

public class SearchIn2DArrray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 11},
                {7, 8, 9, 12, 13},
        };
        int target = 11;
        int []ans = search2DArray(arr,target);
        System.out.println(Arrays.toString(ans));

        System.out.println(Max2DArray(arr));

        System.out.println(Min2DArray(arr));
    }

    private static int[] search2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    private static int Max2DArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
    private static int Min2DArray(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element <  min) {
                    min = element;
                }
            }
        }
        return min;
    }
}
