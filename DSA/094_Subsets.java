import java.util.*;

public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), result);

        return result;
    }

    public static void backtrack(
            int[] nums,
            int index,
            List<Integer> current,
            List<List<Integer>> result) {

        // Add current subset
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            // Take
            current.add(nums[i]);

            // Explore
            backtrack(nums, i + 1, current, result);

            // Don't take
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = subsets(nums);

        System.out.println(result);
    }
}
