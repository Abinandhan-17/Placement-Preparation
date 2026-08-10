import java.util.*;

public class UncommonWordsFromTwoSentences {

    public static String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();

        String combined = s1 + " " + s2;

        for (String word : combined.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> result = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                result.add(word);
            }
        }

        return result.toArray(String[]::new);
    }

    public static void main(String[] args) {

        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        String[] result = uncommonFromSentences(s1, s2);

        System.out.println(Arrays.toString(result));
    }
}
