package neetcode.hashing;

public class DesignHashset {
    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
        System.out.println(set.contains(3));
        set.remove(2);
        System.out.println(set.contains(2));

    }

    static class MyHashSet {
        private boolean[] set;

        public MyHashSet() {
            set = new boolean[1000000];
        }

        public void add(int key) {
            set[key] = true;
        }

        public void remove(int key) {
            set[key] = false;
        }

        public boolean contains(int key) {
            return set[key];
        }
    }
    /**
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     * **/
}
