/*public class Man {
    static int miss(int[]arr){
        int n = arr.length+1;
        int expectedsum = n*(n+1)/2;
        int actualsum = 0;
        for(int num:arr){
            actualsum = actualsum+num;


        }
        return expectedsum-actualsum;
    }
    
   public static void main(String[]args){
    int[]arr = {1,2,3,4,6};
    System.out.println(miss(arr));

   }
}
public class Man {

    static void max(int[]arr,int target){
        for(int num : arr){
            arr[num]+arr[num+1]==double target;
        }
    }
    public static void main(String[] args) {
        
    }
}
*/
public class Man {
   static int maxproductsubarray(int[]arr){
    int ma = Integer.MIN_VALUE;
    
    for(int i = 0; i<arr.length;i++){
        for(int j = i; j<arr.length;j++){
            int prod = 1;
            for(int k=i+1;k<arr.length;k++){
                prod = arr[k]*prod;
               ma = Math.max(ma,prod);

            }

        }
    }
    return ma;

   } 
    public static void main(String[]args){

        int[]arr = {1,-2,-3,0,-4,-5};
        System.out.println(maxproductsubarray(arr));
    }
}
