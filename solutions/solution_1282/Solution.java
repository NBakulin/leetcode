 package solutions.solution_1282;

import java.util.*;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> usersGroupsMap = new HashMap<>();
        List<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> group = usersGroupsMap.computeIfAbsent(groupSizes[i], k -> new ArrayList<>());
            group.add(i);
            if (group.size() == groupSizes[i]) {
                result.add(group);
                usersGroupsMap.remove(groupSizes[i]);
            }
        }

        return result;
    }
}
