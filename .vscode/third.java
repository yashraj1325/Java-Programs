/*public class third {
    public static void main(String args[]){
        int counter = 0;
        while(counter < 100){
            System.out.println("hello world");
            counter++;
        }
        System.out.println("hello world 100*");

    }
    {

    }
    
}
//print square pattern
import java.util.Scanner;
public class third {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while(counter <=range){
            System.out.print(counter +" ");
        }
        System.out.println();

    }
}

public class third{
    public static void main(String args[]){
        for(int i=0;i<=4;i++){
            System.out.println("****");
            
        }
    }
}
int line = 1;
while(line <= 4){
    system.out.println("****"){
        line++;
    }
}

//print reverse of the number
public class third{
    public static void main(String args[]){
        int n = 10899;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;//n/=10

        }
    }
}

public class third {
    public static void main(String args[]){
        int n = 12345;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
//keep entering no fill user enter the multipule of 10
import java.util.Scanner;
public class third {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);

        }while(true);

    }
}
*/