package DSA.arrayAndArrayList;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 1,3));
    }

    private static int max(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

        private static int maxInRange ( int[] arr, int start, int end){
        int maxval = arr[start];
            for (int i = start; i <= end; i++) {
                if (maxval < arr[i]) {
                    maxval = arr[i];
                }
            }
            return maxval;
        }
    }

