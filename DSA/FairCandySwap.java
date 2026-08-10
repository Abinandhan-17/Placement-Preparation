import java.util.HashSet;

public class FairCandySwap {

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceSum = 0;
        int bobSum = 0;

        for (int candy : aliceSizes) {
            aliceSum += candy;
        }

        HashSet<Integer> bobSet = new HashSet<>();

        for (int candy : bobSizes) {
            bobSum += candy;
            bobSet.add(candy);
        }

        int difference = (aliceSum - bobSum) / 2;

        for (int candy : aliceSizes) {

            int required = candy - difference;

            if (bobSet.contains(required)) {
                return new int[]{candy, required};
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {

        int[] aliceSizes = {1, 1};
        int[] bobSizes = {2, 2};

        int[] result = fairCandySwap(aliceSizes, bobSizes);

        System.out.println(result[0] + " " + result[1]);
    }
}