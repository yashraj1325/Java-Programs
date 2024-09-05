import java.util.Scanner;

public class Krishna {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int copy = n;
        int sum = 0;
        int r = 0;
        int f = 1;
        while(n>0){
             r=n%10;
            for(int i=0;i<=r;i++){
                f=i*r;


            }
            sum = f+sum;
             n = n/10;
        }
        if(copy==sum){
            System.out.println("krishnamurti number");}
        else{
            System.out.println("not a krishnamurti number");
        
        }

    }

    
}
 