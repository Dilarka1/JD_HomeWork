package com.cybertek.services.roomType;

import com.cybertek.interfaces.Rooms.Room;

import java.util.Scanner;

public class LivingRoom implements Room {
    @Override
    public void roomAres() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the living room:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the living room:");
        double width = scanner.nextDouble();

        //Area = length*width;
        double areaLivinRoom = length * width;
        System.out.println("Area of the living room is:" + areaLivinRoom);
    }
}
