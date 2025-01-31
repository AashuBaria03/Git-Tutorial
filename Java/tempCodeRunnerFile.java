public class SumOfRunningArray {

    public static int[] solution(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] result = { 1, 2, 3, 4, 5 };
        solution(result);
        System.err.println(result);

        System.out.print("Running Sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}