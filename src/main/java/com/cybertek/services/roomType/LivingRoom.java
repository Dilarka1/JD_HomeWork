package com.cybertek.services.roomType;

import com.cybertek.interfaces.Rooms.Room;

import java.util.Scanner;

public class LivingRoom implements Room {
    double length = 12;
    double width = 10;

    @Override
    public void roomArea() {

        //Area = length*width;
        double areaLivingRoom = length * width;
        System.out.println("Area of the living room is:" + areaLivingRoom);
    }
}