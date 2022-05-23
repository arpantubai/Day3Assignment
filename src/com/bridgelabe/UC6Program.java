package com.bridgelabe;

public class UC6Program {
    public static void main(String[] args) {
        int partTime = 8;
        int fullTime = 12;
        int perHourWage = 20;
        int otTime = 100;
        int totalWorkingDays = 20;

        if (partTime > 5) {
            System.out.println(((partTime * perHourWage) * totalWorkingDays) + (otTime * perHourWage));
        } else if (fullTime > 8) {
            System.out.println((fullTime * perHourWage) * totalWorkingDays);
        } else {
            System.out.println("Emp is not Present");
        }

    }
    }