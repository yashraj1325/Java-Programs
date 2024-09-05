

/*class me {
    public static void main(String[]args){
        int a = 10;
        int v = 23;
        //swap
        int temp = a;
        a = b;
        int b= temp;


    }
    
}

import java.util.Arrays;
class Me {
    public static void main(String ar[]){
        //create an array
        int[] arr = {1,2,3,4,5,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
   
public class Me {
    public static void main(String[]args){
        int a= 10;
        int b = 20;
//scope concept : scope is that we can access the variable in that class only;
    }
   { a = 100;
    we can not intaiallize the same variable in the class 
    but we can update modified and delete the vairiable in the class
    //value intialize int hte block ,will remain in the block
} 
//

}
System.out.println("a");
   

//prime number
class Me {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.print(ans);
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if (c * c > n){
            return true;

        }
        return false;

    }
}
    */
class Me {
    public boolean ispalindrome (int x) {
        if (x<0){
            return false;
        }
        String str = Integer.toString(x);
        int i = 0,j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}  