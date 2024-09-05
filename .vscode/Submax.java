public class Submax {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0]; // Initialize with the first element
        int maxEndingHere = nums[0]; // Initialize with the first element

        // Start from the second element since we initialized with the first
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum is: " + maxSubArray(nums));  // Output: 6
    }
}

    

