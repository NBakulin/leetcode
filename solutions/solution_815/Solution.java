package solutions.solution_815;

import java.util.*;

class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        Map<Integer, List<RouteNode<Integer, Integer>>> graph = new HashMap<>();

        for (int i = 0; i < routes.length; i++) {
            int[] route = routes[i];
            for (int j = 1; j < route.length; j++) {
                int startingPoint = route[j - 1];
                if (graph.containsKey(startingPoint) == false) {
                    graph.put(startingPoint, new ArrayList<>());
                }
                graph.get(startingPoint).add(new RouteNode<>(startingPoint, i));
            }
        }

        int minChangesCount = routes.length + 1;


        return -1;
    }
}
