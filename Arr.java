public class Arr {
    public static int  Missing(int[]arr,int n){
        int first = n*(n+1)/2; 
        int arrsum = 0;
        for(int i =0;i<n;i++){
            
         arrsum = arr[i]+arrsum;
    }
    return first-arrsum ;

    }
    
   
    public static void main(String[] args) {
        int arr[]= {1,2,3,5,6,7};
        int n =7;
        Missing(arr,n);
    }
}







}
   /*  public static int Max(int[] arr) {
         int maxElement = arr[0];
     
     for(int i = 0;i<arr.length;i++){
             if(arr[i] > maxElement){
                 maxElement = arr[i];

             }
         }
        return maxElement;
 
     }
     public static void main(String[]args){
         int[]arr={45,75,84,12,56,46};
         int Maxvalue = Max(arr);
         System.out.println("the maximum element  is "+Maxvalue);
     }
     
 }
 */