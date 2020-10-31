package com.cybertek.services.roomType;

import com.cybertek.interfaces.Rooms.Room;

import java.util.Scanner;

public class DiningRoom implements Room {

    double length = 10;
    double width = 10;

    @Override
    public void roomArea() {

        //Area = length*width;
        double areaDiningRoom = length * width;
        System.out.println("Area of the dining room is:" + areaDiningRoom);
    }
}
