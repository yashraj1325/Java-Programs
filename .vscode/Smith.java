
import java.util.Scanner;

public class Smith {public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number ");
    int n = sc.nextInt();
    int copy = n;
    int sumfact=0;
    int sumdigit =0;
    while(n>0){
        int r= n%10;
        sumdigit=r+sumdigit;
        n = n/10;
    }
    //sum of prime factor
    for(int i=2;i<=copy;){
        if(copy%i==0){
            if(i>9){
                int num =i;
                while(num>0){
                    int r= num%10;
                    sumfact = sumfact+i;
                    copy=copy/i;
                }
            

            }
            else{
                sumfact = sumfact+i;
                copy=copy/i;

            }
            i++;
            }
            

        }


    }

}
    

