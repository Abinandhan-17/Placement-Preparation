import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {

    public static String[] findRelativeRanks(int[] score) {

        int[] sorted = score.clone();
        Arrays.sort(sorted);

        HashMap<Integer, String> map = new HashMap<>();

        int rank = 1;

        for (int i = sorted.length - 1; i >= 0; i--) {

            String medal = switch (rank) {
                case 1 -> "Gold Medal";
                case 2 -> "Silver Medal";
                case 3 -> "Bronze Medal";
                default -> String.valueOf(rank);
            };
            map.put(sorted[i], medal);

            rank++;
        }

        String[] result = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            result[i] = map.get(score[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] score = {5, 4, 3, 2, 1};

        String[] result = findRelativeRanks(score);

        System.out.println(Arrays.toString(result));
    }
}