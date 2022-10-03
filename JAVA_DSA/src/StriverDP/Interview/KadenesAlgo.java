package StriverDP.Interview;

import java.util.ArrayList;

public class KadenesAlgo {

    public static int maxSubArray(int[] nums, ArrayList < Integer > subarray) {
        int max_sum = Integer.MIN_VALUE;
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++)
                    sum = sum + nums[k];
                if (sum > max_sum) {
                    subarray.clear();
                    max_sum = sum;
                    subarray.add(i);
                    subarray.add(j);
                }
            }
        }
        return max_sum;
    }
    public static void main(String args[]) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        ArrayList< Integer > subarray = new ArrayList < > ();
        int lon = maxSubArray(arr, subarray);
        System.out.println("The longest subarray with maximum sum is " + lon);
        System.out.println("The subarray is ");
        for (int i = subarray.get(0); i <= subarray.get(1); i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

