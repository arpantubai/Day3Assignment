package com.bridgelabe;

public class Switchcase {
    public static void main(String[] args) {
        int fullTime = 3;
        int partTime = 4;
        int perHourWage = 20;
        int fullDayHours = 12;
        int halfDayHours = 8;
        switch (partTime = 4) {
            case 1:
                System.out.println(perHourWage * fullDayHours + "Rs");
                break;
            case 2:
                System.out.println(perHourWage * halfDayHours + "Rs");
                break;
            case 3:
                System.out.println("Emp is Absent");

        }
    }
}