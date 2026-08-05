import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {

    public static List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> result = new ArrayList<>();

        int start = 0;

        for (int i = 1; i <= s.length(); i++) {

            if (i == s.length() || s.charAt(i) != s.charAt(start)) {

                if (i - start >= 3) {
                    List<Integer> group = new ArrayList<>();
                    group.add(start);
                    group.add(i - 1);
                    result.add(group);
                }

                start = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "abbxxxxzzy";

        System.out.println(largeGroupPositions(s));
    }
}