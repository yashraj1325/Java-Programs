public class Rotate {
    static void reverse(int[]arr,int k){
        int n = arr.length;
        rotate(arr,0,n-1);
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);
        

    }

    public static void rotate(int[]arr,int start,int end){
        while(start<end){
        double temp = arr[start];
        arr[start]=arr[end];
        arr[end]= (int)temp;
        start++;
        end --;
        }
        
    }
    public static void main(String[]args){
    int[]arr= {1,2,3,4,5,6,7,8,9};
    int k = 3;
reverse(arr,k);
for(int i : arr){
    System.out.print(i+" ");
}

    }

}
