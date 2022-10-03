package DSA.searchingAlgo.linearSearch;

public class LinearSearch {
    // search the target and return index.
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 1, 23 , -4, -23};
        int target =30;
        int ans = linearSearch(nums , target);
        System.out.println(ans);
    }
    static int linearSearch(int []arr, int target){
        if(arr.length ==0){
            return -1;
        }
        //for (int element : arr){
          //  if (element == target){
            //    return element;
            //}
for (int index =0; index < arr.length; index++){
    int element = arr[index];
    if(element == target){
        return index;
    }

} return -1;
        }
    }

