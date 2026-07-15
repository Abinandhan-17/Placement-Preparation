import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);

        System.out.println("Result: " + result);
    }
}