package solution_215;

import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Dictionary<Integer, Integer> dict= new Hashtable<>();
        List<Integer> keysList = new ArrayList<Integer>();

        for (int i = 0; i <= nums.length - 1; i++) {
            Integer currentValue = (Integer)nums[i];
            Integer currentCount = dict.get(currentValue);
            if (currentCount == null) {
                keysList.add(currentValue);
                dict.put(currentValue, 1);
            } else {
                dict.put(currentValue, currentCount + 1);
            }
        }

        Integer kInteger = (Integer)k;
        Enumeration<Integer> keys = dict.keys();
        Collections.sort(keysList);
        int i =  keysList.size() - 1;

        while (i >= 0) {
            Integer key = keysList.get(i);
            Integer val = dict.get(key);
            if (kInteger <= val) {
                return key;
            } else {
                kInteger -= val;
            }
            i--;
        }

        return 0;
    }
}