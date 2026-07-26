import java.util.PriorityQueue;

public class KthLargestElementInAStream {

    private final PriorityQueue<Integer> minHeap;
    private final int k;

    // Constructor
    public KthLargestElementInAStream(int k, int[] nums) {

        this.k = k;
        minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }

    // Add a new element and return the kth largest
    public int add(int val) {

        minHeap.offer(val);

        if (minHeap.size() > k) {
            minHeap.poll();
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int k = 3;
        int[] nums = {4, 5, 8, 2};

        KthLargestElementInAStream obj =
                new KthLargestElementInAStream(k, nums);

        System.out.println(obj.add(3));   // 4
        System.out.println(obj.add(5));   // 5
        System.out.println(obj.add(10));  // 5
        System.out.println(obj.add(9));   // 8
        System.out.println(obj.add(4));   // 8
    }
}
