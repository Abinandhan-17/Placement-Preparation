import java.util.HashMap;

public class BinarySubarraysWithSum {

    public static int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 occurs once initially
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            // Need previous prefix sum = prefixSum - goal
            if (map.containsKey(prefixSum - goal)) {
                count += map.get(prefixSum - goal);
            }

            map.put(prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        System.out.println(numSubarraysWithSum(nums, goal));
    }
}