//package solutions.solution_1584;

import java.util.*;

class Solution {
    Map<Integer, List<Integer>> edgesList;
    public int minCostConnectPoints(int[][] points) {
        int length = points.length;
        int result = 0;
        Queue<int[]> distancesWithNodes = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        this.edgesList = new HashMap<>();

        for (int i = 0; i < length; i++) {
            this.edgesList.put(i, new LinkedList<>());
            for (int j = i + 1; j < length; j++) {
                int[] pointI = points[i];
                int[] pointJ = points[j];
                int distance = Math.abs(pointI[0] - pointJ[0]) + Math.abs(pointI[1] - pointJ[1]);

                distancesWithNodes.add(new int[]{ distance, i, j});
            }
        }

        int edgesCount = 0;

        while (distancesWithNodes.isEmpty() == false) {
            if (edgesCount == length - 1) {
                break;
            }
            int[] distanceWithNodes = distancesWithNodes.poll();

            int firstNode = distanceWithNodes[1];
            int secondNode = distanceWithNodes[2];

            List<Integer> firsNodeConnections = this.edgesList.get(firstNode);
            List<Integer> secondNodeConnections = this.edgesList.get(secondNode);
            firsNodeConnections.add(secondNode);
            secondNodeConnections.add(firstNode);

            if (firsNodeConnections.size() == 1 || secondNodeConnections.size() == 1 || this.hasCycle(secondNode, secondNode,null) == false) {
                edgesCount++;
                result += distanceWithNodes[0];
            } else {
                firsNodeConnections.remove(firsNodeConnections.size() - 1);
                secondNodeConnections.remove(secondNodeConnections.size() - 1);
            }
        }

        return result;
    }

    public boolean hasCycle(Integer currentNode, Integer startingNode, Integer previousNode)
    {
        boolean result = false;

        List<Integer> edges = this.edgesList.get(currentNode);
        if (edges == null) {
            return false;
        }

        for (Integer point: edges) {
            if (point.equals(previousNode)) {
                continue;
            }

            if (point.equals(startingNode)) {
                return true;
            }

            result |= this.hasCycle(point, startingNode, currentNode);
        }

        return result;
    }
}
