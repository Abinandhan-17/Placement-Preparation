import java.util.HashSet;

public class NRepeatedElement {

    public static int repeatedNTimes(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return num;
            }

            set.add(num);
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 3};

        System.out.println(repeatedNTimes(nums));
    }
}