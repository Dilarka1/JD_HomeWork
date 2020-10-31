package com.cybertek.services.calculator;

import com.cybertek.interfaces.Calculator;
import com.cybertek.interfaces.Rooms.Room;
import com.cybertek.interfaces.price.State;
import com.cybertek.interfaces.tax.Tax;
import com.cybertek.services.roomType.Bedroom;
import com.cybertek.services.roomType.HallWay;


public class TotalPrice implements Calculator {
    private Room room;
    private State state;
    private Tax tax;

    public TotalPrice(Room room) {
        this.room = room;
    }

    public TotalPrice(State state) {
        this.state = state;
    }

    public TotalPrice(Tax tax) {
        this.tax = tax;
    }

    public void totalPrice() {
        //total price = price per sq.ft * area + tax

        room.roomArea();
        state.getPriceByState();
        tax.getTax();

    }
}
