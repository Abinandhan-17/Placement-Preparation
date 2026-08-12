import java.util.HashMap;

public class XOfAKindInADeckOfCards {

    public static boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int card : deck) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int gcd = 0;

        for (int count : map.values()) {
            gcd = findGCD(gcd, count);
        }

        return gcd >= 2;
    }

    private static int findGCD(int a, int b) {

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        int[] deck = {1, 2, 3, 4, 4, 3, 2, 1};

        System.out.println(hasGroupsSizeX(deck));
    }
}
