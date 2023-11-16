package solutions.solution_1980;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();

        int index = 0;
        for (String num: nums) {
            sb.append(num.charAt(index++) == '0' ? '1' : '0');
        }

        return sb.toString();
    }
}