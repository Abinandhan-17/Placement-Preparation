import java.util.*;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int previousDay = stack.pop();

                result[previousDay] = i - previousDay;
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] temperatures = {
            73, 74, 75, 71, 69, 72, 76, 73
        };

        int[] result = dailyTemperatures(temperatures);

        System.out.println(
            "Result: " + Arrays.toString(result)
        );
    }
}