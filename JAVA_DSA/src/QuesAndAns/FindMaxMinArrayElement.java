package QuesAndAns;

public class FindMaxMinArrayElement {
    public static void main(String[] args) {
    int arr[]= {10,20,30,40,50};

        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int max(int []arr){
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (sum < arr[i]){
                sum = arr[i];

            }
        }
   return sum;
    }
    static int  min(int []arr){
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (sum > arr[i]){
                sum = arr[i];

            }
        }
        return sum;
    }
}
