package com.bridgelabe;

public class UC5Program {
    public static void main(String[] args) {
        int partTime = 8;
        int fullTime = 12;
        int perHourWage = 20;
        int totalWorkingDays = 20;

        if (partTime > 9) {
            System.out.println((partTime * perHourWage) * totalWorkingDays);
        } else if (fullTime > 8) {
            System.out.println((fullTime * perHourWage) * totalWorkingDays);
        }else{
            System.out.println("Emp is not Present");
        }
    }
}
