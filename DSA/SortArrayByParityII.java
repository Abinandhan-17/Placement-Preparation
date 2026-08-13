import java.util.Arrays;

public class SortArrayByParityII {

    public static int[] sortArrayByParityII(int[] nums) {

        int evenIndex = 0;
        int oddIndex = 1;

        while (evenIndex < nums.length && oddIndex < nums.length) {

            // Find an odd number at an even index
            while (evenIndex < nums.length && nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }

            // Find an even number at an odd index
            while (oddIndex < nums.length && nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
            }

            if (evenIndex < nums.length && oddIndex < nums.length) {

                int temp = nums[evenIndex];
                nums[evenIndex] = nums[oddIndex];
                nums[oddIndex] = temp;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {4, 2, 5, 7};

        int[] result = sortArrayByParityII(nums);

        System.out.println(Arrays.toString(result));
    }
}