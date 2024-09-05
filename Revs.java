import java.util.Scanner;
public class Revs {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         String sen =sc.nextLine();
         String rev=" ";
        
         for(int i=0;i<sen.length();i++){
            char ch=sen.charAt(i);
            rev = ch+rev;
           
         
    }
    System.out.print(rev);
         

    
}
}