class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid], then move both pointers forward
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Move mid forward
                mid++;
            } else { // nums[mid] == 2
                // Swap nums[mid] and nums[high], then move high backward
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums = {2, 0, 2, 1, 1, 0};
        sol.sortColors(nums);
        
        // Print sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
