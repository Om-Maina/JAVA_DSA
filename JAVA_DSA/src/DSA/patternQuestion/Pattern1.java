package DSA.patternQuestion;

public class Pattern1 {
    public static void main(String[] args) {
     //   System.out.println(pattern1(););
        pattern1(5);
//        pattern2(5);
//        pattern3(5);
        //pattern4(5);
        //pattern5(5);
      //  pattern6(5);
      //  pattern7(5);
        //pattern8(5);
        //pattern9(5);
//        pattern10(5);
    }
    static void pattern10(int n){
        int orignalN = n;
        n = 2*n;
        for (int row = 0; row <= n ; row++){
            for (int col = 0; col <= n ; col++) {
                int atEverIndex = orignalN - Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(atEverIndex + " ");

            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        n = 2*n;
        for (int row = 0; row <  n ; row++){
            for (int col = 0; col < n ; col++) {
                int atEverIndex = Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(atEverIndex + " ");

            }
        System.out.println();
    }
}

    static void pattern8(int n){
        for (int row=1; row<= 2 * n; row ++ )
        {
            int totalcolinrow = row > n ? 2*n-row: row;
            for (int space =0; space < n-totalcolinrow; space++){
                System.out.print(" ");
            }
            for(int col =totalcolinrow;col >=1; col--){
                System.out.print(col);
            }
            for (int col =2; col<= totalcolinrow;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int row=1; row<=n; row ++ )
        {
       for (int space =0; space < n-row; space++){
           System.out.print(" ");
       }
            for(int col =row;col >=1; col--){
                System.out.print(col);
            }
            for (int col =2; col<= row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern6(int n){

        for (int row = 1; row < 2 * n;row++ ){
            //for every row run the col
            int totalcolinrow = row > n ? 2*n-row: row;

            int noofspaces = n-totalcolinrow;
            for(int s=0;s<noofspaces;s++){
                System.out.print(" ");
            }

            for(int col =1 ; col < totalcolinrow ; col++){
                System.out.print("* " );
            }
            //when one row is printed we need to add a new line
            System.out.println();
        }
    }
    static void pattern5(int n){

        for (int row = 1; row < 2 * n;row++ ){
            //for every row run the col
          int totalcolinrow = row > n ? 2*n-row: row;
            for(int col =1 ; col < totalcolinrow ; col++){
                System.out.print(" *" );
            }
            //when one row is printed we need to add a new line
            System.out.println();
        }
    }
    static void pattern1(int n){

        for (int row = 1; row <= n;row++ ){
        //for every row run the col
            for(int col =1 ; col<= row; col++){
                System.out.print("*");
            }
            //when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row =1; row<=n;row++){
            for (int col =1; col<= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){

        for (int row = 1; row <= n;row++ ){
            //for every row run the col
            for(int col =1 ; col<= n-  row +1; col++){
                System.out.print("*");
            }
            //when one row is printed we need to add a new line
            System.out.println();
        }
    }
    static void pattern4(int n){

        for (int row = 1; row <= n;row++ ){
            //for every row run the col
            for(int col =1 ; col<= row ; col++){
                System.out.print(col );
            }
            //when one row is printed we need to add a new line
            System.out.println();
        }
    }

}
