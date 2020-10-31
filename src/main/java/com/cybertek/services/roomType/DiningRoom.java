package com.cybertek.services.roomType;

import com.cybertek.interfaces.Rooms.Room;

import java.util.Scanner;

public class DiningRoom implements Room {
    @Override
    public void carpetForRoom() {

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the dining room:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of teh dining room:");
        double width = scanner.nextDouble();

        //Area = length*width;
        double area = length * width;
        System.out.println("Area of the dining room is:" + area);
    }
}
