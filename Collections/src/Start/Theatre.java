package Start;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum < seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }
//
//    public int binarySearch(ArrayList<Seat> seats, String n) {
//        int left = 0;
//        int right = seats.size();
//        int mid = (int) Math.floor((left + right) / 2);
//        if (seats.get(mid).getSeatNumber().equals(n)) {
//            System.out.println(seats.get(mid).getSeatNumber());
//            return mid;
//        } else {
//            if (seats.get(mid).getSeatNumber().compareTo(n) < 0) {
//                left = mid;
//            } else {
//                right = mid;
//            }
//            ArrayList<Seat> currentArray = new ArrayList<>(seats.subList(left, right));
//            return binarySearch(currentArray, n);
//        }
//    }

    public boolean reserveSeat(String seatNumber) {
//        int requestedSeatNumber = binarySearch(seats, seatNumber);
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat");
            return false;
        }
//        for(Seat seat : seats) {
//            if (requestedSeat == null) {
//                System.out.println("There is no seat " + seatNumber);
//                return false;
//            }
//        }
//        return requestedSeat.reserve();
    }
    public boolean cancelReservation(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
        return seats.get(foundSeat).cancel();
    }

    public List<Seat> getSeats() {
        return seats;
    }

    class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        private Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                System.out.println("Seat is already reserved");
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }


}
