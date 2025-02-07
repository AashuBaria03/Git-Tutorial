public class SingleNumber {

    public static int solution(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;  // XOR all elements
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4})); // Output: 5
        System.out.println(solution(new int[]{4, 1, 2, 1, 2})); // Output: 4
        System.out.println(solution(new int[]{2, 2, 1})); // Output: 1
    }
}
