public class VerifyingAnAlienDictionary {

    public static boolean isAlienSorted(String[] words, String order) {

        int[] rank = new int[26];

        // Store the position of each character
        for (int i = 0; i < order.length(); i++) {
            rank[order.charAt(i) - 'a'] = i;
        }

        // Compare adjacent words
        for (int i = 0; i < words.length - 1; i++) {

            String word1 = words[i];
            String word2 = words[i + 1];

            int length = Math.min(word1.length(), word2.length());

            boolean different = false;

            for (int j = 0; j < length; j++) {

                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);

                if (c1 != c2) {

                    if (rank[c1 - 'a'] > rank[c2 - 'a']) {
                        return false;
                    }

                    different = true;
                    break;
                }
            }

            // Example: "apple" comes after "app"
            if (!different && word1.length() > word2.length()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String[] words = {"hello", "leetcode"};

        String order = "hlabcdefgijkmnopqrstuvwxyz";

        System.out.println(isAlienSorted(words, order));
    }
}
