package solutions.solution_1845;

import java.util.TreeSet;

class SeatManager {

    TreeSet<Integer> availableSeats = new TreeSet<>();
    int minAvailableSeat = 1;

    public SeatManager(int n) {
    }

    public int reserve() {
        if (!availableSeats.isEmpty()) {
            int result =  availableSeats.first();
            availableSeats.remove(result);

            return result;
        }
        return minAvailableSeat++;
    }

    public void unreserve(int seatNumber) {
        availableSeats.add(seatNumber);
    }
}
