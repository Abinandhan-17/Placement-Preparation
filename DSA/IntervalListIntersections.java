import java.util.*;

public class IntervalListIntersections {

    public static int[][] intervalIntersection(
            int[][] firstList,
            int[][] secondList) {

        List<int[]> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {

            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

            if (start <= end) {
                result.add(new int[]{start, end});
            }

            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        // List to 2D array
        int[][] answer = new int[result.size()][2];

        for (int k = 0; k < result.size(); k++) {
            answer[k][0] = result.get(k)[0];
            answer[k][1] = result.get(k)[1];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[][] firstList = {
            {0, 2},
            {5, 10},
            {13, 23},
            {24, 25}
        };

        int[][] secondList = {
            {1, 5},
            {8, 12},
            {15, 24},
            {25, 26}
        };

        int[][] result =
            intervalIntersection(firstList, secondList);

        for (int[] interval : result) {
            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}