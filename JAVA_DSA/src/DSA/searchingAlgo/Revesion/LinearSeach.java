package DSA.searchingAlgo.Revesion;

public class LinearSeach {
    // retrun index of element
    public static int Linear(int[] arr, int Element) {
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (Element == arr[index]) {
                return index;
            }
        }
        return -1;
    }
    // if element is present it will return element
    public static  int linear1(int[] arr,  int target){
        if(arr.length == 0){
            return -1;
        }
        for (int element : arr) {
            if (target == element){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = {29, 23, -1, 657, 786, 33,-1};
        int Element = 33;
        int result = Linear(arr, Element);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is at index " + result);
        }

    }
}
