import java.util.Arrays;

public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {

        int n = arr.length;

        int zeros = 0;

        // Count zeros
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }

        // Start from the end
        int i = n - 1;
        int j = n + zeros - 1;

        while (i >= 0 && j >= 0) {

            // If destination is inside the array
            if (j < n) {
                arr[j] = arr[i];
            }

            // Duplicate zero
            if (arr[i] == 0) {

                j--;

                if (j < n) {
                    arr[j] = 0;
                }
            }

            i--;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}
