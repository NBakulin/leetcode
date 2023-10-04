package solutions.solution_706;

import java.util.ArrayList;
import java.util.List;

class MyHashMap {

    private final List<Integer[]> list = new ArrayList<>();

    public MyHashMap() {

    }

    public void put(int key, int value) {
        if (this.list.isEmpty()) {
            this.list.add(new Integer[]{key, value});
            return;
        }
        int index = this.binarySearch(key);
        if (index < 0) {
            this.list.add(this.searchInsertIndex(key), new Integer[]{key, value});
        } else {
            this.list.remove(index);
            this.list.add(index, new Integer[]{key, value});
        }
    }

    public int get(int key) {
        int index = this.binarySearch(key);
        if (index < 0) return index;
        return this.list.get(this.binarySearch(key))[1];
    }

    public void remove(int key) {
        int index = this.binarySearch(key);
        if (index >= 0) this.list.remove(index);
    }

    int binarySearch(int key) {
        int left = 0;
        int right = this.list.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            Integer[] midValue = this.list.get(mid);

            if (midValue[0] == key) {
                return mid;
            } else if (midValue[0] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    int searchInsertIndex(int key) {
        int left = 0;
        int right = this.list.size() - 1;
        int mid = 0;

        while (left <= right) {
            mid = (left + right + 1) / 2;
            Integer[] midValue = this.list.get(mid);

            if (midValue[0] == key) {
                return mid;
            } else if (midValue[0] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return (left + right + 1) / 2;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
