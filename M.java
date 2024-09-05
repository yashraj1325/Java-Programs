import java.util.Scanner;
public class M {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int max=0;
        while(n>0){
            int r = n%10;
            if(r>max){
                max=r;

            }
            n=r/10;
        }
        System.out.println("maximum number is"+max);
      
      
        

    }
    
}
