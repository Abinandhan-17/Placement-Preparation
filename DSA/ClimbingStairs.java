import java.util.Scanner;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of stairs: ");
            int n = sc.nextInt();

            System.out.println("Number of ways: " + climbStairs(n));
        }
    }
}