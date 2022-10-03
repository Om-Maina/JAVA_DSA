package DSA.searchingAlgo.Revesion;

public class FindMin {
    public static void main(String[] args) {
        int []arr = {55,66,-7,888,99,55,33,44};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
    if (arr.length == 0){
        return -1;
    }
    int temp = arr[0];

        for (int index = 1; index < arr.length; index++) {
            if(temp > arr[index]){
                temp = arr[index];
            }
        }
        return temp;
    }

}

