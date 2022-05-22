package com.bridgelabe;

public class UC1Program {
    public static void main(String[] args) {
        int fullTime = 0;
        int empType = (int) (Math.random() * 100) % 2;
        if (empType == fullTime) {
            System.out.println("Emp is Present");
        } else {
            System.out.println("Emp is not Present");
        }
    }
}
