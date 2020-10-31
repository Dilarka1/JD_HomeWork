package com.cybertek.services.roomType;

import com.cybertek.interfaces.Rooms.Room;

import java.util.Scanner;

public class HallWay implements Room {
    double length = 9.5;
    double width = 6.4;
    @Override
    public void roomArea() {

        //Area = length*width;
        double areaHallway = length * width;
        System.out.println("Area of the hallway is:" + areaHallway);
    }
}