package DSA.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
int arr[] = {10,20,39,49,69,70};
int target = 69;
int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    //return index.
    static int binarysearch(int [] arr, int target){
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
        return -1;
    }
}

