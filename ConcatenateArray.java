public class ConcatenateArray {
    public static void main(String[] args) {
        // Example input array
        int[] nums = {1, 2, 3, 4};
        
        // Call the method to get the concatenated array
        int[] ans = getConcatenation(nums);

        // Print the resulting array
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        
        return ans;
    }
}
