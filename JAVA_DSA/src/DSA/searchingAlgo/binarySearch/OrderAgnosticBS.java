package DSA.searchingAlgo.binarySearch;

public class OrderAgnosticBS {
    //work for both ascending or descending order.
    public static void main(String[] args) {
       // int arr[] = {100, 90, 69, 57, 48, 39, 20, 10};
        int arr[] ={-1 , 0, 2, 6, 8 ,9 ,89};
        int target = 8;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAcd = arr[start] < arr[end];
        while (start <= end) {
            //finding middle element.
            // int mid = start + end / 2; // this mite exceed the range of int.
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAcd) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
            return -1;
        }
    }


