package solutions.solution_1615;

import java.util.*;

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        Map<Integer, List<Integer>> cityConnections = new HashMap<>();
        Map<String, Boolean> checkedConnections = new HashMap<>();

        for (int[] road : roads) {
            cityConnections.computeIfAbsent(road[0], k -> new ArrayList<>()).add(road[1]);
            cityConnections.computeIfAbsent(road[1], k -> new ArrayList<>()).add(road[0]);
        }

        int maxRank = 0;

        for (Map.Entry<Integer, List<Integer>> firstCityEntry : cityConnections.entrySet()) {
            Integer firstCity = firstCityEntry.getKey();
            int firstCityRank = firstCityEntry.getValue().size();

            for (Map.Entry<Integer, List<Integer>> secondCityEntry : cityConnections.entrySet()) {
                Integer secondCity = secondCityEntry.getKey();
                int secondCityRank = secondCityEntry.getValue().size();

                if (firstCity.equals(secondCity)) {
                    continue;
                }

                int rank = firstCityRank + secondCityRank;
                if (cityConnections.get(firstCity).contains(secondCity)) {
                    rank--;
                }
                maxRank = Math.max(rank, maxRank);
            }
        }

        return maxRank;
    }
}