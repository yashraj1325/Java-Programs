import java.util.Scanner;


public class Apk {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n; int copy2 = n;
        int count = 0; int s =0;
        while(copy>0){
            count++;
            copy = copy/10;
        }
        while(copy2>0){
            int r=copy2%10;
             s = s + (int) Math.pow(r,count--);
        }
        if(n==s){
            System.out.println("disarium number");
        }
        else
        System.out.println("not a disarium number");
           


        
    }
    
}
/* 
import java.util.Scanner;

public class Apk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int copy = n;
        int copy2 = n;
        int count = 0;
        int s = 0;
        
        // Calculate the number of digits
        while (copy > 0) {
            count++;
            copy = copy / 10;
        }
        
        copy = n; // Reset copy to the original number
        
        // Calculate the sum of digits raised to the power of their positions
        while (copy > 0) {
            int r = copy % 10;
            s = s + (int) Math.pow(r, count);
            copy = copy / 10;
            count--;
        }
        
        // Check if the original number is equal to the calculated sum
        if (copy2 == s) {
            System.out.println(copy2 + " is a Disarium number.");
        } else {
            System.out.println(copy2 + " is not a Disarium number.");
        }
        
        sc.close();
    }
}
*/