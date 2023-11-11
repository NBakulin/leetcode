package solutions.solution_2642;

import java.util.*;

class Graph {

    List<List<Pair<Integer, Integer>>> graph = new ArrayList<>();
    public Graph(int n, int[][] edges) {
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge: edges) {
            graph.get(edge[0]).add(new Pair<>(edge[1], edge[2]));
        }
    }

    public void addEdge(int[] edge) {
        graph.get(edge[0]).add(new Pair<>(edge[1], edge[2]));
    }

    public int shortestPath(int node1, int node2) {
        int n = graph.size();
        int[] nodesCosts = new int[n];
        Arrays.fill(nodesCosts, Integer.MAX_VALUE);
        nodesCosts[node1] = 0;
        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(list -> list.get(0)));
        queue.offer(Arrays.asList(0, node1));

        while (queue.isEmpty() == false) {
            List<Integer> node = queue.poll();
            int accumulatedValue = node.get(0);
            int nodeIndex = node.get(1);

            if (accumulatedValue > nodesCosts[nodeIndex]) continue;
            if (nodeIndex == node2) return accumulatedValue;

            for (Pair<Integer, Integer> pairEntry: graph.get(nodeIndex)) {
                int newValue = accumulatedValue + pairEntry.length;
                if (newValue < nodesCosts[pairEntry.node]) {
                    nodesCosts[pairEntry.node] = newValue;
                    queue.offer(Arrays.asList(newValue, pairEntry.node));
                }
            }
        }

        return -1;
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
