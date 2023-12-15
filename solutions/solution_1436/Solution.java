package solutions.solution_1436;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> startingPoints = new HashSet<>();

        for (List<String> way: paths) {
            startingPoints.add(way.get(0));
        }

        for (List<String> way: paths) {
            String destination = way.get(1);
            if (startingPoints.contains(destination) == false) {
                return destination;
            }
        }

        return "";
    }
}
