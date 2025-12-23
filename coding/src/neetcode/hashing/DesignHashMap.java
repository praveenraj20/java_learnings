package neetcode.hashing;

public class DesignHashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 1);
        map.put(2, 2);
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        map.put(2, 1);
        System.out.println(map.get(2));
        map.remove(2);
        System.out.println(map.get(2));
    }

    static class MyHashMap {
        private int[] map;

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
    /**
     * Time Complexity : O(1)
     * Space Complexity : O(1)
     * **/
}
