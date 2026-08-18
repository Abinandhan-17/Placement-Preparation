public class PartitionArrayIntoThreeParts {

    public static boolean canThreePartsEqualSum(int[] arr) {

        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        // Total must be divisible by 3
        if (totalSum % 3 != 0) {
            return false;
        }

        int target = totalSum / 3;
        int sum = 0;
        int parts = 0;

        for (int num : arr) {

            sum += num;

            if (sum == target) {
                parts++;
                sum = 0;
            }
        }

        return parts >= 3;
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};

        System.out.println(canThreePartsEqualSum(arr));
    }
}
