import java.util.Arrays;

public class ShortestDistanceToCharacter {

    public static int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] result = new int[n];

        int prev = -n;

        // Left to Right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = i - prev;
        }

        // Right to Left
        prev = 2 * n;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "loveleetcode";
        char c = 'e';

        System.out.println(Arrays.toString(shortestToChar(s, c)));
    }
}