public class GoatLatin {

    public static String toGoatLatin(String sentence) {

        String vowels = "aeiouAEIOU";
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            if (vowels.indexOf(word.charAt(0)) != -1) {
                result.append(word);
            } else {
                result.append(word.substring(1));
                result.append(word.charAt(0));
            }

            result.append("ma");

            for (int j = 0; j <= i; j++) {
                result.append("a");
            }

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String sentence = "I speak Goat Latin";

        System.out.println(toGoatLatin(sentence));
    }
}
