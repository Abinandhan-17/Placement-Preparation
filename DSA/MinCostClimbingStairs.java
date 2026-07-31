public class MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int first = cost[0];
        int second = cost[1];

        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(first, second);
            first = second;
            second = current;
        }

        return Math.min(first, second);
    }

    public static void main(String[] args) {

        int[] cost = {10, 15, 20};

        System.out.println(minCostClimbingStairs(cost));
    }
}