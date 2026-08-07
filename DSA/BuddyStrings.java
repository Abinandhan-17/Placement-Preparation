import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BuddyStrings {

    public static boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {

            HashSet<Character> set = new HashSet<>();

            for (char ch : s.toCharArray()) {
                if (!set.add(ch)) {
                    return true;
                }
            }

            return false;
        }

        List<Integer> diff = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }

        if (diff.size() != 2) {
            return false;
        }

        int i = diff.get(0);
        int j = diff.get(1);

        return s.charAt(i) == goal.charAt(j)
                && s.charAt(j) == goal.charAt(i);
    }

    public static void main(String[] args) {

        String s = "ab";
        String goal = "ba";

        System.out.println(buddyStrings(s, goal));
    }
}