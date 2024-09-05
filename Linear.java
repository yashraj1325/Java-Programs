public class Linear{
    public static int linear(int num[],int target){
        for(int i = 0;i<num.length;i++){
            if(num[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int n[]={2,4,5,6,9,1,3};
        int target = 4 ;
        int result = linear(n,target);
        if(result == 1){
            System.out.println("found the target at"+result);
        }
        else{
            System.out.println("not found the target");
        }

    }
}

/*public class Linear {
    public static int linear(int num[], int target) {
        for (int i = 0; i < num.length; i++) { // Corrected the loop condition
            if (num[i] == target) { // Compare the element with the target
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int n[] = {2, 4, 56, 6, 4, 3}; // Example array
        int target = 4; // Example target value
        int result = linear(n, target); // Perform the linear search
        if (result != -1) {
            System.out.println("Found the target " + target + " at index " + result);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }
    }
}
*/