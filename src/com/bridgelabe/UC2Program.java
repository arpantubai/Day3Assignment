package com.bridgelabe;

public class UC2Program {
    public static void main(String[] args) {
        int empPrep = 1;
        int perHourWage = 22;
        int fullDayHours = 6;

        int empType = (int) (Math.random() * 100) % 2;
        if (empType == empPrep) {
            System.out.println((perHourWage * fullDayHours) + "Rs");
        } else {
            System.out.println("Emp is not Present");
        }
    }
}