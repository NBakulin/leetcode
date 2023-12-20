package solutions.solution_2706;

class Solution {
    public int buyChoco(int[] prices, int money) {
        int lowestPrice = 101;
        int secondLowestPrice = 101;

        for (int price: prices) {
            if (price < lowestPrice) {
                secondLowestPrice = lowestPrice;
                lowestPrice = price;
                continue;
            }

            if (price < secondLowestPrice) {
                secondLowestPrice = price;
            }
        }

        if (money >= lowestPrice + secondLowestPrice) {
            return money - lowestPrice - secondLowestPrice;
        }

        return money;
    }
}
