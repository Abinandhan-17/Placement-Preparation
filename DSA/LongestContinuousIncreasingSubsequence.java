public class LongestContinuousIncreasingSubsequence {

    public static int findLengthOfLCIS(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int max = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 4, 7};

        System.out.println(findLengthOfLCIS(nums));
    }
}