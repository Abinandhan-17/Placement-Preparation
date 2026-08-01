import java.util.Scanner;

public class MinimumCostToMoveChips {

    public static int minCostToMoveChips(int[] position) {

        int even = 0;
        int odd = 0;

        for (int chip : position) {
            if (chip % 2 == 0)
                even++;
            else
                odd++;
        }

        return Math.min(even, odd);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of chips: ");
            int n = sc.nextInt();

            int[] position = new int[n];

            System.out.println("Enter chip positions:");
            for (int i = 0; i < n; i++) {
                position[i] = sc.nextInt();
            }

            System.out.println("Minimum Cost: " + minCostToMoveChips(position));
        }
    }
}