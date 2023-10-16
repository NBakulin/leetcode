package solutions.solution_119;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            for (int j = 0; j <= row.size(); j++) {
                int newValue;
                if (j == 0 || j == row.size()) {
                    newValue = 1;
                } else {
                    newValue = row.get(j - 1) + row.get(j);
                }
                newRow.add(newValue);
            }
            row = newRow;
        }

        return row;
    }
}
