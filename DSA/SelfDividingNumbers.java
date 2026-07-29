import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            int num = i;
            boolean valid = true;

            while (num > 0) {

                int digit = num % 10;

                if (digit == 0 || i % digit != 0) {
                    valid = false;
                    break;
                }

                num /= 10;
            }

            if (valid) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int left = 1;
        int right = 22;

        System.out.println(selfDividingNumbers(left, right));
    }
}