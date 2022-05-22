package com.bridgelabe;

public class UC3Program {
    public static void main(String[] args) {

            int IS_PART_TIME = 1;
            int IS_FULL_TIME = 2;
            int EMP_RATE_PER_HOUR = 20;
            int empHRS = 0;
            int empWAGE = 0;

            double empcheck = Math.floor(Math.random() * 10) % 3;

            if(empcheck == IS_FULL_TIME)
                empHRS = 8;
            else if (empcheck == IS_PART_TIME)
                empHRS = 4;

            empWAGE = empHRS * EMP_RATE_PER_HOUR;

            System.out.println("Emp wage " + empWAGE);

        }
    }
