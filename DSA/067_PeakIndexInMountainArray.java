public class PeakIndexInMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 5, 3, 1};

        System.out.println(peakIndexInMountainArray(arr));
    }
}
