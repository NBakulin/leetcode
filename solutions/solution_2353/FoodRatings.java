package solutions.solution_2353;

import java.util.*;

class FoodRatings {

    public Map<String, PriorityQueue<FoodWitRating>> cuisineFoodMap = new HashMap<>();
    public Map<String, String> foodCuisineMap = new HashMap<>();
    public Map<String, Integer> foodRaitingsMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            String cuisine = cuisines[i];
            FoodWitRating food = new FoodWitRating(foods[i], ratings[i]);
            this.foodCuisineMap.put(food.food, cuisine);
            this.foodRaitingsMap.put(food.food, food.rating);

            if (cuisineFoodMap.get(cuisine) == null) {
                PriorityQueue<FoodWitRating> queue = new PriorityQueue<>();
                queue.add(food);
                cuisineFoodMap.put(cuisine, queue);
            } else {
                cuisineFoodMap.get(cuisine).add(food);
            }
        }
    }

    public void changeRating(String food, int newRating) {
        foodRaitingsMap.put(food, newRating);
        String cuisineName = foodCuisineMap.get(food);
        cuisineFoodMap.get(cuisineName).add(new FoodWitRating(food, newRating));
    }

    public String highestRated(String cuisine) {
        FoodWitRating highestRated = cuisineFoodMap.get(cuisine).peek();

        while (foodRaitingsMap.get(highestRated.food) != highestRated.rating) {
            cuisineFoodMap.get(cuisine).poll();
            highestRated = cuisineFoodMap.get(cuisine).peek();
        }

        return highestRated.food;
    }
}

class FoodWitRating implements Comparable<FoodWitRating> {

    public String food;
    public int rating;

    public FoodWitRating(String food, int rating) {
        this.food = food;
        this.rating = rating;
    }

    @Override
    public int compareTo(FoodWitRating foodItem2) {
        if (foodItem2.rating != this.rating) {
            return Integer.compare(foodItem2.rating, this.rating);
        }

        return this.food.compareTo(foodItem2.food);
    };
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
