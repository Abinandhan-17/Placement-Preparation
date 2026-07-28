public class DesignHashMap {

    static class MyHashMap {

         private final int[] map;

        public MyHashMap() {
            map = new int[1000001];

            for (int i = 0; i < map.length; i++) {
                map[i] = -1;
            }
        }

        public void put(int key, int value) {
            map[key] = value;
        }

        public int get(int key) {
            return map[key];
        }

        public void remove(int key) {
            map[key] = -1;
        }
    }

    public static void main(String[] args) {

        MyHashMap obj = new MyHashMap();

        obj.put(1, 1);
        obj.put(2, 2);

        System.out.println(obj.get(1)); // 1
        System.out.println(obj.get(3)); // -1

        obj.put(2, 1);
        System.out.println(obj.get(2)); // 1

        obj.remove(2);
        System.out.println(obj.get(2)); // -1
    }
}