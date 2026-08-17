import java.util.*;

public class FindCommonCharacters {

    public static List<String> commonChars(String[] words) {

        int[] minFreq = new int[26];

        // Start with frequency of first word
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (String word : words) {

            int[] freq = new int[26];

            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }

            // Keep minimum frequency
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < 26; i++) {

            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) ('a' + i)));
                minFreq[i]--;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] words = {"bella", "label", "roller"};

        System.out.println(commonChars(words));
    }
}