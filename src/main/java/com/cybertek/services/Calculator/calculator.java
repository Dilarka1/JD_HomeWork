package com.cybertek.services.Calculator;

import com.cybertek.interfaces.Rooms.Room;
import com.cybertek.interfaces.price.State;
import com.cybertek.interfaces.tax.Tax;

import java.util.Scanner;

public class Calculator {
    private Room room;
    private State state;
    private Tax tax;

    public Calculator(Room room) {
        this.room = room;
    }

    public Calculator(State state) {
        this.state = state;
    }

    public Calculator(Tax tax){
        this.tax = tax;
    }

    public void totalPrice() {
        //total price = price per sq.ft * area + tax

        System.out.println(state.getPriceByState() * room.roomAres() + tax.getTax());



     //   System.out.println("Total price for " + room + " is " + totalPrice);
    }
}
