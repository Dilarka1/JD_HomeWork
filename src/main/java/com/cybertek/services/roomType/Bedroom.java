package com.cybertek.services.roomType;

import com.cybertek.interfaces.Rooms.Room;

import java.util.Scanner;

public class Bedroom implements Room {
    @Override
    public void carpetForRoom() {

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the bedroom:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the bedroom:");
        double width = scanner.nextDouble();

        //Area = length*width;
        double area = length * width;
        System.out.println("Area of the bedroom is:" + area);
    }
}