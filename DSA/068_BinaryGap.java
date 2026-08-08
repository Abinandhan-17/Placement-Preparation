public class BinaryGap {

    public static int binaryGap(int n) {

        int maxDistance = 0;
        int lastPosition = -1;
        int position = 0;

        while (n > 0) {

            if ((n & 1) == 1) {

                if (lastPosition != -1) {
                    maxDistance = Math.max(
                            maxDistance,
                            position - lastPosition
                    );
                }

                lastPosition = position;
            }

            n >>= 1;
            position++;
        }

        return maxDistance;
    }

    public static void main(String[] args) {

        int n = 22;

        System.out.println(binaryGap(n));
    }
}
