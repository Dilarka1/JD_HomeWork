package com.cybertek.services.roomType;

import com.cybertek.interfaces.Rooms.Room;

import java.util.Scanner;

public class Bedroom implements Room {

    double length = 13;
    double width = 8.8;

    @Override
    public void roomArea() {

        //Area = length*width;
        double areaBedroom = length * width;
        System.out.println("Area of the bedroom is:" + areaBedroom);
    }
}
