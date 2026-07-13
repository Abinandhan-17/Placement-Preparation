public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;   // XOR operation
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};

        System.out.println("Single Number: " + singleNumber(nums));
    }
}