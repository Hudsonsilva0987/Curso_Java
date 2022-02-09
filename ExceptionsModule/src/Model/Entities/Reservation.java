package Model.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Date checkIn;
    private Date checkOut;
    private Integer roomNumber;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Date checkIn, Date checkOut, Integer roomNumber) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomNumber = roomNumber;
    }


    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }


    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long duration() {
        long diff = getCheckOut().getTime() - getCheckIn().getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();
        if ((!checkOut.after(checkIn)) || (checkIn.before(now) || checkOut.before(now))) {
            return "Invalid Date to update ";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
        }

    @Override
    public String toString() {
        return "Room : " +
                getRoomNumber() +
                ", Date checkIn " +
                sdf.format(getCheckIn()) +
                ", Date checkOut " +
                sdf.format(getCheckOut()) +
                " " +duration() +
                " Nights";

    }
}
