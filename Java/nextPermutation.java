public class nextPermutation {
    public static void solution(int[] nums) {
        int n = nums.length, i, j;

        // Step 1: Find first decreasing element from right
        for (i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1])
                break;
        }

        // Step 2: Find element just larger than nums[i] and swap
        if (i >= 0) {
            for (j = n - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    break; // Swap done, exit loop
                }
            }
        }

        // Step 3: Reverse the elements after index 'i' to get next permutation
        reverse(nums, i + 1, n - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int nums[], int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Example input
        solution(nums);
        
        System.out.print("Next Permutation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
