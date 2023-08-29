package solutions.solution_2483;

class Solution {
    public int bestClosingTime(String customers) {
        int initialPenalty = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                initialPenalty++;
            }
        }

        if (initialPenalty == 0) {
            return 0;
        }

        int minPenalty = initialPenalty;
        int minPenaltyIndex = 0;
        int currentPenalty = initialPenalty;

        for (int i = 0; i < customers.length(); i++) {
            int newPenalty = currentPenalty;

            if (customers.charAt(i) == 'Y') {
                newPenalty--;
            } else {
                newPenalty++;
            }

            if (minPenalty > newPenalty) {
                minPenalty = newPenalty;
                minPenaltyIndex = i + 1;
            }

            currentPenalty = newPenalty;
        }

        return minPenaltyIndex;
    }
}
