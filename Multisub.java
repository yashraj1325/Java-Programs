public class Multisub {
static void multi(int[]arr){
    int max = Integer.MIN_VALUE;
    for(int i =0 ;i<arr.length;i++){
        for(int j =i;j<arr.length;j++){
            for(int k = i+1; k<arr.length;k++){
                int product = 1; 
                product = product * arr[k];
                result = Math.max(result, product);
            }
            return result;
        }

    }

}

    public static void main(String[] args) {
       
        
    }
}
    

