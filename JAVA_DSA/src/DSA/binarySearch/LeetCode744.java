package DSA.binarySearch;

public class LeetCode744 {
    public static void main(String[] args) {
        char letters[] = {'c','g','j'};
        char target = 'k';
        char ans= ceilingBS(letters,target);
        System.out.println(ans);
    }
    // return index of smallest no >= target.
// the letters wrap around.
    static char ceilingBS(char [] letters, int target){

        int start = 0;
        int end = letters.length-1;

        while(start <= end) {
            //finding middle element.
            // int mid = start + end / 2; // this mite exceed the range of int.
            int mid = start + (end - start) /2;

            if ( target < letters[mid]){
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}

