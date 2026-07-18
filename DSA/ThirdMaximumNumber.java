public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {

        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {

            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            } 
            else if (second == null || num > second) {
                third = second;
                second = (long) num;
            } 
            else if (third == null || num > third) {
                third = (long) num;
            }
        }

        if (first == null) {
            // no elements in array
            return 0;
        }
        return (third == null) ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1};

        System.out.println(thirdMax(nums));
    }
}