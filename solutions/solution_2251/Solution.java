package solutions.solution_2251;

import java.util.Arrays;

class Solution {

    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] result = new int[people.length];

        int[] bloomStarts = new int[flowers.length];
        int[] bloomEnds = new int[flowers.length];

        for (int i = 0; i < flowers.length; i++) {
            int[] flower = flowers[i];
            bloomStarts[i] = flower[0];
            bloomEnds[i] = flower[1] + 1;
        }
        Arrays.sort(bloomStarts);
        Arrays.sort(bloomEnds);

        for (int i = 0; i < people.length; i++) {
            int person = people[i];
            int started =  binarySearch(person, bloomStarts);
            int ended = binarySearch(person, bloomEnds);
            result[i] =  started - ended;
        }

        return result;
    }

    public int binarySearch(int time, int[] times) {
        int left = 0;
        int right = times.length;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;

            if (time < times[mid])
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}