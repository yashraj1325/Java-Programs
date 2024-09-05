public class ArrayNesting {
    static boolean canNest (int[]arr1,int[]arr2){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i : arr1){
            if(i<min1){
                min1=i;
            }
            if(i>max1){
                max1=i;
            }
        }
        for(int j : arr2){
            if(j<min2){
                min2=j;
            }
            if(j>max2){
                max2=j;
         }
        }
           
            return min1>min2&&max1<max2;
       
       
    }
    public static void main(String[] args) {
        System.out.println(canNest(new int[]{1, 2, 3, 4}, new int[]{0, 6}));  // ➞ true
        System.out.println(canNest(new int[]{3, 1}, new int[]{4, 0}));        // ➞ true
        System.out.println(canNest(new int[]{9, 9, 8}, new int[]{8, 9}));     // ➞ false
        System.out.println(canNest(new int[]{1, 2, 3, 4}, new int[]{2, 3}));  // ➞ false
    }
}
/* another method
 public class ArrayNesting {
    static boolean canNest(int[] arr1, int[] arr2) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Find min and max of arr1
        for (int i : arr1) {
            if (i < min1) {
                min1 = i;
            }
            if (i > max1) {
                max1 = i;
            }
        }

        // Find min and max of arr2
        for (int j : arr2) {
            if (j < min2) {
                min2 = j;
            }
            if (j > max2) {
                max2 = j;
            }
        }

        // Check the nesting conditions using if-else
        if (min1 > min2 && max1 < max2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(canNest(new int[]{1, 2, 3, 4}, new int[]{0, 6}));  // ➞ true
        System.out.println(canNest(new int[]{3, 1}, new int[]{4, 0}));        // ➞ true
        System.out.println(canNest(new int[]{9, 9, 8}, new int[]{8, 9}));     // ➞ false
        System.out.println(canNest(new int[]{1, 2, 3, 4}, new int[]{2, 3}));  // ➞ false
    }
}

 */