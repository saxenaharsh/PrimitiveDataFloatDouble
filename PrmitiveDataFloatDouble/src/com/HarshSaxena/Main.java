package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntNumber = 5 / 3;
        float myFloatNumber = 5f / 3f;
        double myDoubleNumber = 5d / 3d;

        System.out.println("My int value = " + myIntNumber);
        System.out.println("My Float value = " + myFloatNumber);
        System.out.println("My Double value = " + myDoubleNumber);

        double myPoundValue = 200d;
        double myKiloValue = (myPoundValue * 0.45359237);
        System.out.println("Six pounds is equal to " + myKiloValue + " Kilograms");

    }
}
