package Reservations;

import java.util.Random;

public class Reservation implements Reservationy {
    private String dow;
    private String code;

    public Reservation(){
        this.dow = getCodeBooking();
        this.code = getDowBooking();
    }

    @Override
    public String getDowBooking() {
        String[] dow = new String[] {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int random = new Random().nextInt(dow.length);
        return dow[random];
    }

    @Override
    public String getCodeBooking() {
        StringBuilder reservationCode = new StringBuilder();
        Random random = new Random();
        char[] rCode = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        for (int sym = 0; sym < 8; sym++) {
            char newSym = rCode[random.nextInt(35)];
            reservationCode.append(newSym);
        }
        return reservationCode.toString();
    }

    public String toString() {
        return "Booking# " + this.getCodeBooking() + " for " + this.getDowBooking();
    }
}
/*
    Create a Reservations.Reservation class by implementing all the features as required by the interface.
        The booked reservations should look like the output below.
        Please note that the reservation code should contain 8 characters randomly from 0-Z, all uppercase letters.
        String.format acts similarly as System.out.printf(); in the previous exercise, however the string will not be automatically printed.
        Also, the DOW is randomly ordered to the bookings from an array.
        DOW stands for Day of the Week (MON, TUE, etc.)
 */