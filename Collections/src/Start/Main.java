package Start;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Crazy Horror Thi", 10, 9);
        theatre.reserveSeat("J05");
        theatre.reserveSeat("J05");
        theatre.cancelReservation("J05");
        theatre.reserveSeat("J05");
        printList(theatre.getSeats());
    }

    public static void printList(List<Theatre.Seat> list) {
        int count = 0;
        for (Theatre.Seat t : list) {
            System.out.print(t.getSeatNumber() + " ");
            count ++;
            if(count % 8 == 0){
                System.out.println();
            }
        }
    }
}
