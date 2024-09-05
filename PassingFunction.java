
import java.util.Arrays;

public class PassingFunction {
    public static void main(String[]args){
        int[]arr = {12,34,564,34,233,23};
        System.out.println(Arrays.toString(arr));
       change(arr);
       System.out.println(Arrays.toString(arr));
       for(int i=0;i<=arr.length;i++){
       System.out.println(arr[i]);
       }
    }
    public static void change(int[] arra){
         arra[0] = 78;
    }
    
}

