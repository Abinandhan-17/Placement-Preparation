import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        boolean[] present = new boolean[nums.length + 1];

        for (int num : nums) {
            present[num] = true;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!present[i]) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println("Missing Numbers: " + result);
    }
}
