/*public class sixth{
    public static void hallo_rectangle(int totRow,int totCols){
        for(int i=1; i<totRow;i++){
            for(int j=1;j<=totCols;j++){
               if(i == 1 || i == totRow || j ==1 || j == totCols) {
                System.out.println("*");
               }else {
                System.out.println(" ");
               }
            }
            System.out.println();
        }
    }
    //public static void main(String args[]){
        hallo_rectangle(4,5);
    }


public class sixth{
public static void inverted_rotated_half_pyramid(int n){
    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=n-1;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.println();
        }
        System.out.println();
    }

}
public static void main(String args[]){
inverted_rotated_half_pyramid(4);
}
}

public class sixth{
    public static void inverted_half_pyramid_withNumbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");



            }
            System.out.println();
        }

        }
        public static void main(String args[]){
            inverted_half_pyramid_withNumbers(7);
        }
    }

public class sixth{
    public static void floyds_triangle(int n){
        int counter =1;
        //for outerloop
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyds_triangle(6);
    }
}

public class sixth{
public static void zero_one_trangle(int n){
    for(int i=1; i<=n; i++){
        for(int j=1 ;j=i;j++){
            if((i+j)%2 ==0){
                System.out.print("1");
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        
    }
    System.out.println();
}
}
public static void main(String args[]){
    zero_one_trangle(8);
}

//butterfly pattern
public class sixth{
    public static void butterfly(int n){
        //for first half
        for(int i=1;i<=n;i++){
            
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
                 }
                //spaces-2*(n-i)
                for(int j=1;j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");

                }
        }
    

//second half
 for(int i=n; i<=1;i++){
            
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
                 }
                //spaces-2*(n-i)
                for(int j=1;j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");

                }
                System.out.println();

            }
            public static void main(String args[]){
                butterfly(8);
            }


        }
    
//solid rhombus
public class sixth{
    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
                //star
                
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        solid_rhombus(10);

    }
}

public class sixth{
    public static void hollow_rombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow rectangle -stars
            for(int j=1;j<=n; j++){
                if(i==1 ||i==n ||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rombus(8);
    }

}
*/
public class sixth{
    public static void Diamond(int n){
        //first half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.println(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n;i<=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.println(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Diamond(4);
    }
}