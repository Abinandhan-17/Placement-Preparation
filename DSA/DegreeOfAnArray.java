import java.util.HashMap;

public class DegreeOfAnArray {

    public static int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();

        int degree = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {

            first.putIfAbsent(nums[i], i);

            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);

            if (count.get(nums[i]) > degree) {
                degree = count.get(nums[i]);
                minLength = i - first.get(nums[i]) + 1;
            } else if (count.get(nums[i]) == degree) {
                minLength = Math.min(minLength, i - first.get(nums[i]) + 1);
            }
        }

        return minLength;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 1};

        System.out.println(findShortestSubArray(nums));
    }
}