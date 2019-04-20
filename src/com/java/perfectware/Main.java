package com.java.perfectware;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double kilometersPerHour = 75.114;
        long milesPerHour = printConversion(kilometersPerHour);

        System.out.println(kilometersPerHour + "km/hr = " + milesPerHour + "mi/hr");

    }


    public static long printConversion(double kilometersPerHour)
    {
        if (kilometersPerHour<0)
        {
            System.out.println("Invalid Value");
            return -1;
        }
        else
        {
            return Math.round(kilometersPerHour/1.609);
        }
    }



}
