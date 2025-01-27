public class SumOfRunningArray {

    // Method to calculate the running sum of an array
    public static int[] solution(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5}; // Input array
        int[] result = solution(nums); // Call the method and store the result

        // Print the result
        System.out.print("Running Sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
