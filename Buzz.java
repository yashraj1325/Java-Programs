import java.util.Scanner;
public class Buzz {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n/7==0||n%10==7){
         System.out.println("tis is buzz number");
        } else{
            System.out.println("not a buzz");

        }
        }

    }
    

