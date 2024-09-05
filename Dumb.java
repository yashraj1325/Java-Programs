
/*public class dumb {

    public static void square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        square(n);
    }
}




public class dumb {
    public static void main(String[]args){
        int n=5;
        pattern(n);
    }
     static void pattern(int n){
        for(int row = 0; row <2*n; row++){
            int totalcol= row >n ? 2*n-row:row;
            for(int col=0; col < totalcol;col++){

                System.out.println("*");

            }
            System.out.print("*");
        }

        }
    }
    


class dumb{
static void main(String[]args){
    
    int n = 5;
    pattern28(n);

}
static void pattern28(int n){
for(int row = 0;row < 2*n;row++){
    int totalcol = row>n?row = 2*n-row:row;
    int space = n-totalcol;
   for (int s = 0; s < space; s++){
        System.out.print(" ");
    }

    for (int col=0; col<totalcol;col++){
        System.out.print("*");

    }
    System.out.println();


}

}
}

public class dumb {
public static void main(String[]args){
    int n=5;
    pattern5(n);
    
}
static void pattern5(int n){
    for(int row = 0 ; row < 2 * n ; row++) {
        int totalcol = row > n ? 2 *n - row : row;
        for (int col = 0; col < totalcol ; col++){
            System.out.print("*");

        }
        System.out.println( " ");
    }
}
}


public class Dumb {  // Error: Class name should start with an uppercase letter
    public static void main(String[]args){
        int n=5;
        pattern5(n);
    }
    
    static void pattern5(int n){
        for(int row = 0 ; row < 2 * n ; row++) {
            int totalcol = row > n ? 2 * n - row : row; 
            int space =n- totalcol ;
           for (int s = 0; s<=totalcol; s++){
            System.out.print(" ");
            }// Error: Logic for row > n should be row >= n, row should also be row + 1
    
            // Missing logic to add leading spaces for centering the diamond
            
            for (int col = 0; col < totalcol ; col++){
                System.out.print("*");
            }
            
            System.out.println( " ");  // Error: Trailing space in the print statement is unnecessary
        }
    }
    }
    */
    public class Dumb {
        public static void main(String[] args) {
            int n = 5;
            pattern5(n);
        }
    
        static void pattern5(int n) {
            for (int row = 0; row < 2 * n - 1; row++) {
                int totalColsInRow = row < n ? row + 1 : 2 * n - row - 1;
    
                // Print leading spaces
                int spaces = n - totalColsInRow;
                for (int s = 0; s < spaces; s++) {
                    System.out.print(" ");
                }
    
                // Print stars
                for (int col = 0; col < totalColsInRow; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    

