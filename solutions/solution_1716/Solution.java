package solutions.solution_1716;

class Solution {
    public int totalMoney(int n) {
        int weeksCount = n / 7;
        int leftDays = n % 7;

        int prevWeek = (1 + weeksCount + leftDays + weeksCount) * leftDays / 2;
        int lastWeek = (weeksCount - 1) * (weeksCount) * 7 / 2 + 28 * weeksCount;;

        return  prevWeek + lastWeek;
    }
}
