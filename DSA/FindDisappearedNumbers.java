import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> ans = findDisappearedNumbers(nums);

        System.out.println(ans);

        sc.close();
    }
    }
}