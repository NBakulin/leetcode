package solutions.solution_1361;

class Solution {
    int[] leftChild;
    int[] rightChild;
    boolean[] dp;

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] incomingCount = new int[n];
        this.dp = new boolean[n];
        this.leftChild = leftChild;
        this.rightChild = rightChild;

        for (int i = 0; i < n; i++) {
            int left = leftChild[i];
            if (left >= 0) {
                incomingCount[left]++;
                if (incomingCount[left] >= 2) return false;
            }

            int right = rightChild[i];
            if (right >= 0) {
                incomingCount[right]++;
                if (incomingCount[right] >= 2) return false;
            }
        }

        int parentlessCount = 0;
        int rootIndex = 0;
        for (int i = 0; i < n; i++) {
            int parentsCount = incomingCount[i];
            if (parentsCount == 0) {
                rootIndex = i;
                parentlessCount++;
            }
            if (parentlessCount > 1) {
                return false;
            }
        }

        boolean result = this.dfs(rootIndex);
        if (!result) {
            return false;
        }

        for (boolean visited: this.dp) {
            if (visited == false) {
                return false;
            }
        }

        return true;
    }

    public boolean dfs(int startingPosition) {
        boolean result = true;

        if (this.dp[startingPosition]) {
            return false;
        }
        this.dp[startingPosition] = true;

        int leftChild = this.leftChild[startingPosition];
        if (leftChild != -1) {
            result &= this.dfs(leftChild);
        }

        int rightChild = this.rightChild[startingPosition];
        if (rightChild != -1) {
            result &= this.dfs(rightChild);
        }

        return result;
    }
}
