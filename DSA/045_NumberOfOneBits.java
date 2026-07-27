import java.util.Scanner;

public class NumberOfOneBits {

    public static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int n = sc.nextInt();

            System.out.println("Number of 1 bits: " + hammingWeight(n));
        }
    }
}
