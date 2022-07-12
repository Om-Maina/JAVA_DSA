package DSA.binarySearch;

public class CeilingBS {
// mains no. is greater or equal to target.
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        int ans= ceilingBS(arr,target);
        System.out.println(ans);
    }
    // return index of smallest no >= target.
    static int ceilingBS(int [] arr, int target){
        // what if the target if grater then the greatest no in  the array.
        if(target <arr[ arr.length]){
            return -1;}

        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            //finding middle element.
            // int mid = start + end / 2; // this mite exceed the range of int.
            int mid = start + (end - start) /2;

            if ( target < arr[mid]){
                end = mid -1;
            } else if ( target > arr[mid]) {
                start = mid + 1;
            } else  {
                return mid;
            }
        }
        return start;
    }
}


