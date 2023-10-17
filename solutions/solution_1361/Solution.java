package solutions.solution_1361;

class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] incomingCount = new int[n];

        for (int i = 0; i < n; i++) {
            int left = leftChild[i];
//            if (left == i) return false;
            if (left >= 0) {
                incomingCount[left]++;
                if (incomingCount[left] >= 2) return false;
            }

            int right = rightChild[i];
//            if (right == i) return false;
            if (right >= 0) {
                incomingCount[right]++;
                if (incomingCount[right] >= 2) return false;
            }
        }

        int parentlessCount = 0;
        for (int parentsCount: incomingCount) {
            if (parentsCount == 0) {
                parentlessCount++;
            }
            if (parentlessCount > 1) {
                return false;
            }
        }

        return parentlessCount == 1;
    }
}
