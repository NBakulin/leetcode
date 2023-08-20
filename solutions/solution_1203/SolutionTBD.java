package solutions.solution_1203;

import java.util.*;

class SolutionTBD {
    // I have a feeling that my solution (TBD) will not work though the task is tough enough, I'll leave it as it is for now
    List<Integer> groupPositions = new ArrayList<>();
    Dictionary<Integer, List<Integer>> inGroupPositions = new Hashtable<>();

    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        Dictionary<Integer, List<Integer>> resultTable = new Hashtable<>();

        for (int i = 0; i < n; i++) {
            if (resultTable.get(group[i]) == null) {
                List<Integer> newList = new ArrayList<>();
                newList.add(i);
                resultTable.put(group[i], newList);
            } else {
                resultTable.get(group[i]).add(i);
            }
        }

        this.groupPositions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> internalbeforeList = beforeItems.get(i);
            for (int j = 0; j < internalbeforeList.size(); j++) {
                int prefixElement = internalbeforeList.get(j);
                int prefixGroup = group[internalbeforeList.get(j)];
                if (prefixGroup != group[i]) {
                    if (this.isValidGroupInsert(prefixGroup, group[i]) == false) {
                        return new int[]{};
                    }
                    this.insertGroup(prefixGroup, group[i]);
                }
                else {
                    if (this.isValidElementInsert(prefixElement, group[i]) == false) {
                        return new int[]{};
                    }
                    this.shuffleElements(prefixElement, i);
                }
            }
        }

        // Here I should build a final list for the output
        Enumeration<Integer> keys = resultTable.keys();
        while (keys.hasMoreElements()) {
            Integer param = keys.nextElement();
            System.out.println(resultTable.get(param));
        }

        return new int[]{};
    }

    public boolean isValidElementInsert(int firstElementIndex, int secondElementIndex) {
        //ToDo finish
        return true;
    }

    public boolean shuffleElements(int firstElementIndex, int secondElementIndex) {
        //ToDo finish
        return true;
    }

    public boolean isValidGroupInsert(int firstGroup, int secondGroup) {
        //ToDo finish
        return true;
    }

    public void insertGroup(int firstGroup, int secondGroup) {
        //ToDo finish
        return;
    }
}

