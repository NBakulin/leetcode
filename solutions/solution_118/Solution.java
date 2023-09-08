package solutions.solution_118;

import java.util.LinkedList;
import java.util.List;

class Solution {
    List<Integer> previousRow = new LinkedList<>();

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < numRows; i++) {
            this.previousRow = this.getNewRow(i + 1);
            result.add(this.previousRow);
        }

        return result;
    }

    public List<Integer> getNewRow(int size) {
        List<Integer> row = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                row.add(1);
            } else {
                row.add(this.previousRow.get(i-1) + this.previousRow.get(i));
            }
        }

        return row;
    }
}

