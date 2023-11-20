package solutions.solution_2391;

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int collectionTime = 0;
        int paperTruckTravelTime = 0;
        int metalTruckTravelTime = 0;
        int glassTruckTravelTime = 0;
        int travelTime = 0;

        for (int i = 0; i < garbage.length; i++) {
            String houseGarbage = garbage[i];
            if (i > 0) travelTime += travel[i - 1];
            if (houseGarbage.indexOf('P') != -1) {
                paperTruckTravelTime = travelTime;
            }
            if (houseGarbage.indexOf('M') != -1) {
                metalTruckTravelTime = travelTime;
            }
            if (houseGarbage.indexOf('G') != -1) {
                glassTruckTravelTime = travelTime;
            }
            collectionTime += houseGarbage.length();
        }

        return collectionTime + paperTruckTravelTime
                + metalTruckTravelTime + glassTruckTravelTime;
    }
}
