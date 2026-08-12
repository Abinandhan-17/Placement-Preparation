public class SmallestRangeI {

    public static int smallestRangeI(int[] nums, int k) {

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int range = max - min - 2 * k;

        return Math.max(0, range);
    }

    public static void main(String[] args) {

        int[] nums = {1};
        int k = 0;

        System.out.println(smallestRangeI(nums, k));
    }
}