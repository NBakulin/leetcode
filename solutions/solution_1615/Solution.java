package solutions.solution_1615;

import java.util.*;

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        Map<Integer, List<Integer>> cityConnections = new HashMap<>();
        Map<String, Boolean> checkedConnections = new HashMap<>();
        
        for (int i = 0; i < roads.length; i++) {
            int[] road = roads[i];
            for (int j = 0; j < 2; j++) {
                if (cityConnections.get(road[j]) == null) {
                    cityConnections.put(road[j], new ArrayList<>(List.of(road[1 - j])));
                } else {
                    List<Integer> cityOneConnections = cityConnections.get(road[j]);
                    cityOneConnections.add(road[1-j]);
                    cityConnections.put(road[j], cityOneConnections);
                }
            }
        }
        
        int maxRank = 0;

        for (Map.Entry<Integer, List<Integer>> entry : cityConnections.entrySet()) {
            Integer city = entry.getKey();
            List<Integer> connections = entry.getValue();
            for (int i = 0; i < connections.size(); i++) {
                Integer connectedCity = connections.get(i);
                if (checkedConnections.get(city + "_" + connectedCity) != null || checkedConnections.get(city + "_" + connectedCity) != null) {
                    continue;
                }
                int rank = cityConnections.get(city).size() + cityConnections.get(connectedCity).size() - 1;
                checkedConnections.put(city + "_" + connectedCity, true);
                if (rank > maxRank) {
                    maxRank = rank;
                }
            }
        }

        return maxRank;
    }
}