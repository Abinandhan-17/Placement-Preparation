import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = {10, 20, 30, 40, 50, 60, 70};

            System.out.print("Enter the element to search: ");
            int target = sc.nextInt();

            int left = 0;
            int right = arr.length - 1;
            int found = -1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    found = mid;
                    break;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (found != -1) {
                System.out.println("Element found at index: " + found);
            } else {
                System.out.println("Element not found");
            }
        }
    }
}
