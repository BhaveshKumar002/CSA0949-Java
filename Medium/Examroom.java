import java.util.TreeSet;

class ExamRoom {
    private final int n;
    private final TreeSet<Integer> occupiedSeats;

    public ExamRoom(int n) {
        this.n = n;
        this.occupiedSeats = new TreeSet<>();
    }

    public int seat() {
        if (occupiedSeats.isEmpty()) {
            return 0;
        }

        int lastSeat = -1;
        int maxDistance = n - 1;

        for (int seat : occupiedSeats) {
            int distance = seat - (lastSeat == -1 ? 0 : lastSeat + 1);
            maxDistance = Math.max(maxDistance, distance);
            lastSeat = seat;
        }

        if (occupiedSeats.first() > maxDistance) {
            return 0;
        }

        if (n - 1 > occupiedSeats.last()) {
            return n - 1;
        }

        return occupiedSeats.ceiling(maxDistance / 2);
    }

    public void leave(int p) {
        occupiedSeats.remove(p);
    }
}
