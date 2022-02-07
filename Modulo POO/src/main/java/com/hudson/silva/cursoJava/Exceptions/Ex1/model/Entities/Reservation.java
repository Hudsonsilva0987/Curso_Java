package com.hudson.silva.cursoJava.Exceptions.Ex1.model.Entities;

import java.util.Date;

public class Reservation {

    private Date checkin;
    private Date checkout;
    private int roomNumber;

    public Reservation(){}
    public Reservation(Date checkin, Date checkout, int roomNumber) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
