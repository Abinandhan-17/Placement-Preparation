import java.util.PriorityQueue;

public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {

        // Max Heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while (maxHeap.size() > 1) {

            int first = maxHeap.poll();
            int second = maxHeap.poll();

            if (first != second) {
                maxHeap.offer(first - second);
            }
        }

        if (maxHeap.isEmpty()) {
            return 0;
        }

        return maxHeap.poll();
    }

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};

        System.out.println(lastStoneWeight(stones));
    }
}
