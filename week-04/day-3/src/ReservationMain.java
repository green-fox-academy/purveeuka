import Reservations.Reservation;

public class ReservationMain {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Reservation reservation = new Reservation();
            System.out.println(reservation.toString());
        }
    }
}
